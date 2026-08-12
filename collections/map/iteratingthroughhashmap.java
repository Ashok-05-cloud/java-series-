import java.util.HashMap;
import java.util.Map;

public class IterateMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Ashok");
        students.put(102, "Rahul");
        students.put(103, "Kiran");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                entry.getKey() + " → " + entry.getValue()
            );
        }
    }
}
