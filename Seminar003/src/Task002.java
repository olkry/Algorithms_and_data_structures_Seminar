// import java.util.Date;

class sList {
      static Node head;

      static class Node {
            int value;
            Node next;
      }

      public static void pushFront(int value) {
            Node node = new Node();
            node.value = value;
            node.next = head;
            head = node;

      }

      public static void popFront() {
            if (head != null) {
                  head = head.next;
            }
      }

      public static void print() {
            Node node = head;
            while (node != null) {
                  System.out.printf("%d", node.value);
                  node = node.next;
            }
            System.out.println();
      }

      public static boolean contains(int value) {
            Node node = head;
            while (node != null) {
                  if (node.value == value) {
                        return true;
                  }
                  node = node.next;
            }
            return false;
      }

      public static void pushBack(int value) { // O(N)
            Node node = new Node();
            node.value = value;

            if (head == null) {
                  head = node;
            } else {
                  Node cur = head;
                  while (cur.next != null) {
                        cur = cur.next;
                  }

                  cur.next = node;
            }
      }

      public static void popBack() { // O(N)
            if (head != null) {
                  if (head.next == null) {
                        head = null;
                  } else {
                        Node cur = head;
                        while (cur.next.next != null) {
                              cur = cur.next;
                        }
                        cur.next = null;
                  }
            }
      }

}

public class Task002 {

      public static void main(String[] args) {
            sList list = new sList();
            for (int i = 1; i <= 5; i++) {
                  list.pushFront(i);
            }

            list.print();

            // list.popFront();
            // list.popFront();

            // list.print();

            // System.out.println(list.contains(2));
            // System.out.println(list.contains(5));

            list.pushBack(7);

            list.print();

            list.popBack();

            list.print();

      }

}
