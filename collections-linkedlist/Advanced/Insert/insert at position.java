public class InsertAtPosition {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        // Move to node before the position
        for (int i = 1; i < position - 1; i++) {

            if (current == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        // Invalid position
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
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

        InsertAtPosition list =
                new InsertAtPosition();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(40, 4);

        System.out.println("Before:");
        list.display();

        list.insertAtPosition(25, 3);

        System.out.println("After:");
        list.display();
    }
}