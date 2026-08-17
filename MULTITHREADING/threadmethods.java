public class ThreadMethods {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println(
            "Thread name: " + thread.getName()
        );

        thread.setName("MainThread");

        System.out.println(
            "New name: " + thread.getName()
        );
    }
}