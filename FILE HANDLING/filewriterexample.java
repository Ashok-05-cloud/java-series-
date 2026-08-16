import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("student.txt")) {

            writer.write("Name: Ashok\n");
            writer.write("Course: Java\n");
            writer.write("Day: 20\n");

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}