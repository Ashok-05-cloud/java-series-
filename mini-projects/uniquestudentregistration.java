import java.util.HashSet;

public class StudentRegistration {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Ashok");
        students.add("Rahul");
        students.add("Ashok");
        students.add("Anil");

        System.out.println("Registered Students:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
