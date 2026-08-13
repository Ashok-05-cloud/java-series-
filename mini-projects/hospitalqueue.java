import java.util.PriorityQueue;

public class HospitalQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> patients =
                new PriorityQueue<>();

        patients.offer(3);
        patients.offer(1);
        patients.offer(2);

        while(!patients.isEmpty()) {
            System.out.println(
                "Treating Priority : " + patients.poll()
            );
        }
    }
}