public class NthNodeFromEnd {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int findNthFromEnd(int n) {

        Node slow = head;
        Node fast = head;

        // Move fast n steps
        for (int i = 0; i < n; i++) {

            if (fast == null) {
                return -1;
            }

            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        NthNodeFromEnd list =
                new NthNodeFromEnd();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next =
                new Node(50);

        System.out.println(
                list.findNthFromEnd(2)
        );
    }
}