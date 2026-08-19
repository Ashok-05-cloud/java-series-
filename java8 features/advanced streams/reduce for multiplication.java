import java.util.Arrays;
import java.util.List;

public class ReduceMultiply {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        int result = numbers.stream()
                            .reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }
}