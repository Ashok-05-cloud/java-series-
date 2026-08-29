public class SearchElement {

    static boolean search(
            Node head,
            int target) {

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(
            search(head, 20)
        );

        System.out.println(
            search(head, 50)
        );
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}