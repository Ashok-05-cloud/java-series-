import java.util.HashSet;

public class StudentSet {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Ashok");
        students.add("Rahul");
        students.add("Ashok");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
