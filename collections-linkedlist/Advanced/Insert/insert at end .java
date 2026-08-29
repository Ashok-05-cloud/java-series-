public class InsertAtEnd {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
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

        InsertAtEnd list =
            new InsertAtEnd();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        list.display();
    }
}