import java.util.Arrays;
import java.util.List;

public class StreamSorted {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(50, 10, 40, 20, 30);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}