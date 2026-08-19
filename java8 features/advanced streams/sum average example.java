import java.util.Arrays;
import java.util.List;

public class SumAverageExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();

        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}