import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(
            String a,
            String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";

        System.out.println(
            isAnagram(a, b)
        );
    }
}