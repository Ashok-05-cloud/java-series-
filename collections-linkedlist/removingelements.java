import java.util.LinkedList;

public class RemoveElements {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ashok");
        names.add("Rahul");
        names.add("Kiran");

        names.removeFirst();
        names.removeLast();

        System.out.println(names);
    }
}
