import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void main(String[] args) {

        List<Integer> marks =
                Arrays.asList(35, 75, 60, 40, 90, 25);

        Map<Boolean, List<Integer>> result =
                marks.stream()
                     .collect(
                         Collectors.partitioningBy(
                             mark -> mark >= 40
                         )
                     );

        System.out.println("Passed: " + result.get(true));
        System.out.println("Failed: " + result.get(false));
    }
}