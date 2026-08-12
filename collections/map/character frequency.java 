import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> frequency =
                new HashMap<>();

        for (char ch : str.toCharArray()) {

            frequency.put(
                ch,
                frequency.getOrDefault(ch, 0) + 1
            );
        }

        System.out.println(frequency);
    }
}