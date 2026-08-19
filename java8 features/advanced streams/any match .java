import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 41);

        boolean result =
                numbers.stream()
                       .anyMatch(n -> n % 2 != 0);

        System.out.println(result);
    }
}