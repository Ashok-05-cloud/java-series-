import java.util.ArrayList;

public class RemoveElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ashok");
        names.add("Rahul");
        names.add("Kiran");

        names.remove("Rahul");

        System.out.println(names);
    }
}
