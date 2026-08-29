public class InsertAtBeginning {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
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

        InsertAtBeginning list =
            new InsertAtBeginning();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertFirst(5);

        list.display();
    }
}