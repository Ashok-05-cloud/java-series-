public class MergeSortedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(
            Node first,
            Node second) {

        Node dummy = new Node(0);

        Node current = dummy;

        while (first != null &&
               second != null) {

            if (first.data <= second.data) {

                current.next = first;
                first = first.next;

            } else {

                current.next = second;
                second = second.next;
            }

            current = current.next;
        }

        // Remaining nodes
        if (first != null) {
            current.next = first;
        } else {
            current.next = second;
        }

        return dummy.next;
    }

    static void display(Node head) {

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

        Node first = new Node(1);
        first.next = new Node(3);
        first.next.next = new Node(5);

        Node second = new Node(2);
        second.next = new Node(4);
        second.next.next = new Node(6);

        Node result = merge(first, second);

        display(result);
    }
}