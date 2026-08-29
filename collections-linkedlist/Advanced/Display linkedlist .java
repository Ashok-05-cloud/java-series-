public class DisplayLinkedList {

    static void display(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(
                current.data + " "
            );

            current = current.next;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        display(first);
    }
}