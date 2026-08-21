import java.util.HashMap;

public class StudentDatabase {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Ashok");
        students.put(102, "Rahul");
        students.put(103, "Kiran");

        int id = 102;

        if (students.containsKey(id)) {

            System.out.println(
                "Student: " + students.get(id)
            );

        } else {

            System.out.println(
                "Student not found"
            );
        }
    }
}