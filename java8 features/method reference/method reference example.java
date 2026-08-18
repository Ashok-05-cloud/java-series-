import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Ashok", "Rahul", "Kiran");

        names.forEach(System.out::println);
    }
}