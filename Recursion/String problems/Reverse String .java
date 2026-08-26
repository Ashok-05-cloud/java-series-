public class ReverseString {

    static void reverse(
            String text,
            int index) {

        if (index < 0) {
            return;
        }

        System.out.print(
            text.charAt(index)
        );

        reverse(
            text,
            index - 1
        );
    }

    public static void main(String[] args) {

        String text = "Java";

        reverse(
            text,
            text.length() - 1
        );
    }
}