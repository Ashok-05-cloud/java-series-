import java.util.HashMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        int[] numbers =
                {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> frequency =
                new HashMap<>();

        for (int number : numbers) {

            frequency.put(
                number,
                frequency.getOrDefault(number, 0) + 1
            );
        }

        System.out.println(frequency);
    }
}