class DownloadTask extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Downloading " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class JoinExample {

    public static void main(String[] args)
            throws InterruptedException {

        DownloadTask task = new DownloadTask();

        task.start();

        task.join();

        System.out.println("Download completed.");
    }
}