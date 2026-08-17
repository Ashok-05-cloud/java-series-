class Printer {

    synchronized void printNumbers() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " : " + i
            );

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class SynchronizationDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Printer printer = new Printer();

        Thread t1 = new Thread(
            printer::printNumbers,
            "Thread-1"
        );

        Thread t2 = new Thread(
            printer::printNumbers,
            "Thread-2"
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}