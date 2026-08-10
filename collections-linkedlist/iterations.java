import java.util.LinkedList;

public class IterateLinkedList {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Ashok");
        students.add("Anil");
        students.add("Rahul");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
