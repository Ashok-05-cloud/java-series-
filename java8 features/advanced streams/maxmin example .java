import java.util.Arrays;
import java.util.List;

public class MaxMinExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 50, 20, 80, 30);

        int max = numbers.stream()
                         .max(Integer::compareTo)
                         .orElse(-1);

        int min = numbers.stream()
                         .min(Integer::compareTo)
                         .orElse(-1);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}