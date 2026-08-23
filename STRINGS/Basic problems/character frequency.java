import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String text = "banana";

        HashMap<Character, Integer> frequency =
                new HashMap<>();

        for (char ch : text.toCharArray()) {

            frequency.put(
                ch,
                frequency.getOrDefault(ch, 0) + 1
            );
        }

        System.out.println(frequency);
    }
}