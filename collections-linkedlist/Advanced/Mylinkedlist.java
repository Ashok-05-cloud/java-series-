public class MyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {

        Node current = head;

        while (current != null) {

            System.out.print(
                current.data + " "
            );

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MyLinkedList list =
            new MyLinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.display();
    }
}