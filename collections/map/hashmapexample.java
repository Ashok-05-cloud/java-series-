import java.util.HashMap;

public class MapOperations {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add
        students.put(101, "Ashok");
        students.put(102, "Rahul");
        students.put(103, "Kiran");

        // Get
        System.out.println("Student: " + students.get(101));

        // Update
        students.put(102, "Anil");

        // Check key
        System.out.println(
            "Contains 103: " + students.containsKey(103)
        );

        // Remove
        students.remove(101);

        // Size
        System.out.println("Size: " + students.size());

        System.out.println(students);
    }
}
