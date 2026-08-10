import java.util.LinkedList;

public class SearchElements {

    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");

        System.out.println(languages.contains("Java"));
    }
}
