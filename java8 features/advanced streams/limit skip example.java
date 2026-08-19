import java.util.Arrays;
import java.util.List;

public class LimitSkipExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()
               .limit(3)
               .forEach(System.out::println);
    }
}