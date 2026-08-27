public class PrintSubsequences {

    static void print(
            String str,
            int index,
            String current) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Take the character
        print(
            str,
            index + 1,
            current + str.charAt(index)
        );

        // Don't take the character
        print(
            str,
            index + 1,
            current
        );
    }

    public static void main(String[] args) {

        print("ABC", 0, "");
    }
}