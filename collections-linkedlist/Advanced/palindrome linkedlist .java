public class PalindromeLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    boolean isPalindrome() {

        if (head == null ||
            head.next == null) {

            return true;
        }

        // Find middle
        Node slow = head;
        Node fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        // Compare
        while (secondHalf != null) {

            if (firstHalf.data !=
                secondHalf.data) {

                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeLinkedList list =
                new PalindromeLinkedList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next =
                new Node(2);
        list.head.next.next.next.next =
                new Node(1);

        System.out.println(
                list.isPalindrome()
        );
    }
}