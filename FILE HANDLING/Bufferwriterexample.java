import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try (
            BufferedWriter writer =
                new BufferedWriter(
                    new FileWriter("students.txt")
                )
        ) {

            writer.write("Ashok");
            writer.newLine();

            writer.write("Rahul");
            writer.newLine();

            writer.write("Kiran");

            System.out.println("Students saved.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}