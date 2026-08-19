import java.util.Arrays;
import java.util.List;

public class FindExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30);

        int result = numbers.stream()
                            .filter(n -> n > 18)
                            .findFirst()
                            .orElse(-1);

        System.out.println(result);
    }
}