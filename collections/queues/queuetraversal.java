import java.util.LinkedList;
import java.util.Queue;

public class QueueTraversal {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Ashok");
        queue.offer("Rahul");
        queue.offer("Anil");

        for(String name : queue) {
            System.out.println(name);
        }
    }
}