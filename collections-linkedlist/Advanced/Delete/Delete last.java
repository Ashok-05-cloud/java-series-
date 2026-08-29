public class DeleteLast {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        // Go to second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove last node
        current.next = null;
    }

    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteLast list = new DeleteLast();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before:");
        list.display();

        list.deleteLast();

        System.out.println("After:");
        list.display();
    }
}