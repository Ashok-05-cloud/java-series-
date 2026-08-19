import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        Optional<Integer> result =
                numbers.stream()
                       .filter(n -> n > 100)
                       .findFirst();

        System.out.println(
            result.orElse(-1)
        );
    }
}