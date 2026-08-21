import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Ashok");
        students.put(102, "Rahul");
        students.put(103, "Kiran");

        System.out.println(students);

        System.out.println(
            students.get(101)
        );
    }
}