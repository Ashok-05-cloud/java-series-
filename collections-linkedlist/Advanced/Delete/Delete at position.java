public class DeleteAtPosition {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;

        // Move to node before target
        for (int i = 1; i < position - 1; i++) {

            if (current.next == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        // Position doesn't exist
        if (current.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Delete target node
        current.next = current.next.next;
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

        DeleteAtPosition list =
                new DeleteAtPosition();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before:");
        list.display();

        list.deleteAtPosition(3);

        System.out.println("After:");
        list.display();
    }
}