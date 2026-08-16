import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try (
            FileWriter writer =
                new FileWriter("students.txt", true)
        ) {

            writer.write("\nAnil");

            System.out.println("Data appended.");

        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}