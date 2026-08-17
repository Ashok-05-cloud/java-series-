class FileDownloader implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 100; i += 20) {

            System.out.println(
                "Downloading: " + i + "%"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Download completed!");
    }
}

public class DownloadSimulation {

    public static void main(String[] args) {

        Thread downloadThread =
                new Thread(new FileDownloader());

        downloadThread.start();

        System.out.println(
            "Main program continues..."
        );
    }
}