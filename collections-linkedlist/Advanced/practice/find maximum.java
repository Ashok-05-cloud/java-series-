public class FindMaximum {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int findMax() {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int max = head.data;

        Node current = head.next;

        while (current != null) {

            if (current.data > max) {
                max = current.data;
            }

            current = current.next;
        }

        return max;
    }

    public static void main(String[] args) {

        FindMaximum list =
                new FindMaximum();

        list.head = new Node(10);
        list.head.next = new Node(50);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(80);
        list.head.next.next.next.next =
                new Node(30);

        System.out.println(list.findMax());
    }
}