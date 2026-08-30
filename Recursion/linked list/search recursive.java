public class SearchRecursive {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    boolean search(
            Node current,
            int target) {

        if (current == null) {
            return false;
        }

        if (current.data == target) {
            return true;
        }

        return search(
            current.next,
            target
        );
    }

    public static void main(String[] args) {

        SearchRecursive list =
                new SearchRecursive();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next =
                new Node(30);

        System.out.println(
            list.search(list.head, 20)
        );
    }
}