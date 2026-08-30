public class FindMiddle {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int findMiddle() {

        Node slow = head;
        Node fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        FindMiddle list =
                new FindMiddle();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next =
                new Node(30);
        list.head.next.next.next =
                new Node(40);
        list.head.next.next.next.next =
                new Node(50);

        System.out.println(
            list.findMiddle()
        );
    }
}