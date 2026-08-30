public class FindMinimum {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int findMin() {

        if (head == null) {
            return Integer.MAX_VALUE;
        }

        int min = head.data;

        Node current = head.next;

        while (current != null) {

            if (current.data < min) {
                min = current.data;
            }

            current = current.next;
        }

        return min;
    }

    public static void main(String[] args) {

        FindMinimum list =
                new FindMinimum();

        list.head = new Node(10);
        list.head.next = new Node(50);
        list.head.next.next = new Node(5);
        list.head.next.next.next =
                new Node(80);

        System.out.println(list.findMin());
    }
}