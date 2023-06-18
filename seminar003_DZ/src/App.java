class pList {
    static Node head;
    static Node tail;

    static class Node {
        int value;
        Node next;
        Node prev;
    }

    public static void pushFront(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public static void print() {
        Node node = head;
        while (node != null) {
            System.out.printf("%d ", node.value);
            node = node.next;
        }
        System.out.println();
    }

    public static void reversing() {
        if (head != null && head.next != null) {
            reversing(head.next, head);
        }
    }

    private static void reversing(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            reversing(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        pList list = new pList();
        for (int i = 1; i <= 10; i++) {
            list.pushFront(i);
        }

        list.print();
        list.reversing();
        list.print();
    }
}
