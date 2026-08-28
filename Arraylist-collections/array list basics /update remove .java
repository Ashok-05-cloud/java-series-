import java.util.ArrayList;

public class UpdateRemove {

    public static void main(String[] args) {

        ArrayList<String> names =
            new ArrayList<>();

        names.add("Ashok");
        names.add("Rahul");
        names.add("Ravi");

        // Update
        names.set(1, "Kiran");

        System.out.println(names);

        // Remove by index
        names.remove(0);

        System.out.println(names);
    }
}