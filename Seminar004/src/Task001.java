
class HashMap { // T1
      private class Entity { // T1
            int key;
            int value;
      }

      class Basket { // T1
            private Node head;

            class Node {
                  Entity entity;
                  Node next;
            }

            public Integer find(int key) { // T2 // O(N) -> O(1)
                  Node node = head;
                  while (node != null) {
                        if (node.entity.key == key) {
                              return node.entity.value;
                        }
                        node = node.next;
                  }
                  return null;
            }

            public boolean push(int key, int value) {  //T3
                  Node node = new Node();
                  node.entity = new Entity();
                  node.entity.key = key;
                  node.entity.value = value;

                  if (head == null) {
                        head = node;
                  } else {
                        Node cur = head;

                        while (cur.next != null) {
                              if (cur.entity.key == key) {
                                    return false;
                              }
                              cur = cur.next;
                        }
                        cur.next = node;
                  }
                  return true;
            }
      }

      final static int INIT_SIZE = 16; // T1
      private Basket[] baskets; // T1

      public HashMap(int size) { // T1
            baskets = new Basket[size];
      }

      public HashMap() { // T1
            this(INIT_SIZE);
      }

      public int getIndex(int key) { // T1 // O(1)
            return key % baskets.length; // [0, baskets.length - 1]
      }

      public Integer find(int key) { // T2
            int index = getIndex(key);
            Basket basket = baskets[index];
            if (basket == null)
                  return null;
            return basket.find(key);
      }

      public boolean push(int key, int value) { //T3
            int index = getIndex(key);
            Basket basket = baskets[index];
            if (basket == null) {
                  Basket b = new Basket();
                  boolean res = b.push(key, value);
                  baskets[index] = b;
                  return res;
            } else {
                  return basket.push(key, value);
            }
      }

}

public class Task001 {

      public static void main(String[] args) {
            HashMap map = new HashMap();

            for (int i = 1; i <= 5; i++) {
                  map.push(i, i);
            }

            System.out.println(map.find(3));
            System.out.println(map.find(6));
      }
}
