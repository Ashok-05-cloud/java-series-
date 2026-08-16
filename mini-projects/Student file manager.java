import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileManager {

    static final String FILE_NAME = "students.txt";

    static void addStudent(String name) {

        try (
            BufferedWriter writer =
                new BufferedWriter(
                    new FileWriter(FILE_NAME, true)
                )
        ) {

            writer.write(name);
            writer.newLine();

            System.out.println(
                name + " added successfully."
            );

        } catch (IOException e) {

            System.out.println(
                "Unable to add student."
            );
        }
    }

    static void displayStudents() {

        try (
            BufferedReader reader =
                new BufferedReader(
                    new FileReader(FILE_NAME)
                )
        ) {

            String line;

            System.out.println("\nStudents:");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(
                "Unable to read students."
            );
        }
    }

    public static void main(String[] args) {

        addStudent("Ashok");
        addStudent("Rahul");
        addStudent("Kiran");

        displayStudents();
    }
}