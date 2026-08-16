import java.io.File;

public class FileInfo {

    public static void main(String[] args) {

        File file = new File("student.txt");

        if (file.exists()) {

            System.out.println("File exists.");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
        }
    }
}