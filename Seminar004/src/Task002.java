
class BinaryTree {
      Node root;

      class Node {
            int value;
            Node left;
            Node right;
      }

      public boolean find(int value) { // O(log N)
            Node cur = root;
            while (cur != null) {
                  if (cur.value == value) {
                        return true;
                  }
                  if (cur.value < value) {
                        cur = cur.right;
                  } else {
                        cur = cur.left;
                  }
            }
            return false;
      }

      public void print() {
            print(root);
      }

      private void print(Node node) {
            if (node == null)
                  return;
            System.out.println(node.value); //+ node.color);

            if (node.left != null)
                  System.out.println("L:" + node.left.value);

            if (node.right != null)
                  System.out.println("R:" + node.right.value);

            print(node.left);
            print(node.right);
      }

}

public class Task002 {

}
