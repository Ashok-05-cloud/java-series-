public class DetectCycle {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    boolean hasCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DetectCycle list = new DetectCycle();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        // Create cycle
        list.head.next.next.next.next =
                list.head.next;

        System.out.println(list.hasCycle());
    }
}