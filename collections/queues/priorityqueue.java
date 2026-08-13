import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(20);
        pq.offer(10);
        pq.offer(40);

        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}