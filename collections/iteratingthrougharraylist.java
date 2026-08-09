import java.util.ArrayList;

public class IterateArrayList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ashok");
        students.add("Anil");
        students.add("Rahul");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
