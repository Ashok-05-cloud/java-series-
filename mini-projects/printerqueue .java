import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

    public static void main(String[] args) {

        Queue<String> jobs = new LinkedList<>();

        jobs.offer("Document1");
        jobs.offer("Document2");
        jobs.offer("Document3");

        while(!jobs.isEmpty()) {
            System.out.println("Printing : " + jobs.poll());
        }
    }
}