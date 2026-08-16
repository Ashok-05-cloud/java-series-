import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {

        try (
            BufferedReader reader =
                new BufferedReader(
                    new FileReader("students.txt")
                );

            BufferedWriter writer =
                new BufferedWriter(
                    new FileWriter("backup.txt")
                )
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file.");
        }
    }
}