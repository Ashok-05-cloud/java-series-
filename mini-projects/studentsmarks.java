import java.util.HashMap;

public class StudentMarks {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Ashok", 85);
        marks.put("Rahul", 78);
        marks.put("Kiran", 92);

        System.out.println("Ashok Marks: "
                + marks.get("Ashok"));

        System.out.println("\nAll Students:");

        for (String name : marks.keySet()) {

            System.out.println(
                name + " → " + marks.get(name)
            );
        }
    }
}
