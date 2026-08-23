import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String text = "swiss";

        LinkedHashMap<Character, Integer> map =
                new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {

            map.put(
                ch,
                map.getOrDefault(ch, 0) + 1
            );
        }

        for (Map.Entry<Character, Integer> entry
                : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(
                    "First non-repeating: "
                    + entry.getKey()
                );

                break;
            }
        }
    }
}