
public class App {

    public Node root;

    public static class Node {
        public int value;
        public Color color;
        public Node leftChild;
        public Node rightChild;
    }

    private enum Color {
        RED, BLACK
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalanse(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalanse(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true;
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalanse(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    private Node rebalanse(Node node) {
        Node result = node;
        boolean needRebalanse;
        do {
            needRebalanse = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalanse = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED) {
                needRebalanse = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.rightChild != null && result.rightChild.color == Color.RED) {
                needRebalanse = true;
                colorSwap(result);
            }
        } while (needRebalanse);
        return result;
    }

    private Node rightSwap(Node node) {
        Node rightChild = node.rightChild;
        Node betweeneChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweeneChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node leftSwap(Node node) {
        Node leftChild = node.leftChild;
        Node betweeneChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweeneChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    public static void printTreeVar2(Node node, String prefix, boolean isTail) {
        if (node != null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node.value + " (" + node.color + ")");

            printTreeVar2(node.leftChild, prefix + (isTail ? "    " : "│   "), false);
            printTreeVar2(node.rightChild, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    public void printVar1() {
        print(root);
    }

    private void print(Node node) {
        if (node == null)
            return;
        System.out.println(node.value); // + node.color);

        if (node.leftChild != null)
            System.out.println("L:" + node.leftChild.value);

        if (node.rightChild != null)
            System.out.println("R:" + node.rightChild.value);

        print(node.leftChild);
        print(node.rightChild);
    }

    public static void main(String[] args) throws Exception {

        App tree = new App();
        int[] values = { 5, 3, 8, 2, 4, 7, 10, 1, 6, 9, 12, 15, 11, 14, 17, 16, 18, 13, 19, 20 };

        for (int value : values) {
            tree.add(value);
        }

        // tree.printVar1();
        // tree.print(tree.root);
        tree.printTreeVar2(tree.root, "", true);

    }
}
