import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        students.put(103, "Kiran");
        students.put(101, "Ashok");
        students.put(102, "Rahul");

        System.out.println(students);
    }
}
