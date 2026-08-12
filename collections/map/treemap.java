import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Kiran");
        students.put(101, "Ashok");
        students.put(102, "Rahul");

        System.out.println(students);
    }
}
