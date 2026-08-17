class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Task is running");
    }
}

public class ThreadUsingRunnable {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread thread = new Thread(task);

        thread.start();
    }
}