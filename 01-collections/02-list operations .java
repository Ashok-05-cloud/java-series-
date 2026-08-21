import java.util.ArrayList;

public class ListOperations {

    public static void main(String[] args) {

        ArrayList<String> names =
                new ArrayList<>();

        // Add
        names.add("Ashok");
        names.add("Rahul");
        names.add("Kiran");

        System.out.println(names);

        // Get
        System.out.println(
            names.get(1)
        );

        // Update
        names.set(1, "Anil");

        // Remove
        names.remove(0);

        // Check
        System.out.println(
            names.contains("Kiran")
        );

        // Size
        System.out.println(
            names.size()
        );

        System.out.println(names);
    }
}