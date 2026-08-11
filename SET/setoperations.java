import java.util.HashSet;

public class SetOperations {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println(set.contains("Java"));

        set.remove("Python");

        System.out.println(set);

        System.out.println("Size = " + set.size());

        System.out.println("Is Empty = " + set.isEmpty());
    }
}
