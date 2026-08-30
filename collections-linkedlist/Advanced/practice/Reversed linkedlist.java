public class ReverseLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;

            current = next;
        }

        head = previous;
    }

    void display() {

        Node current = head;

        while (current != null) {

            System.out.print(
                current.data + " → "
            );

            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLinkedList list =
                new ReverseLinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next =
                new Node(30);
        list.head.next.next.next =
                new Node(40);

        System.out.println("Before:");
        list.display();

        list.reverse();

        System.out.println("After:");
        list.display();
    }
}