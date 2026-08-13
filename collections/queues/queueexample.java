import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Ashok");
        queue.offer("Rahul");
        queue.offer("Kiran");

        System.out.println(queue);
    }
}