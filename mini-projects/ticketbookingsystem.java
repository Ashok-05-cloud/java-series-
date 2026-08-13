import java.util.LinkedList;
import java.util.Queue;

public class TicketBookingSystem {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Ashok");
        queue.offer("Rahul");
        queue.offer("Kiran");

        while(!queue.isEmpty()) {
            System.out.println("Serving : " + queue.poll());
        }
    }
}