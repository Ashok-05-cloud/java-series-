import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCombined {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5, 2, 8, 1, 4, 10);

        List<Integer> result =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .map(n -> n * n)
                       .sorted()
                       .collect(Collectors.toList());

        System.out.println(result);
    }
}