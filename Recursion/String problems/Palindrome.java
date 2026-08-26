public class Palindrome {

    static boolean isPalindrome(
            String text,
            int left,
            int right) {

        if (left >= right) {
            return true;
        }

        if (text.charAt(left)
                != text.charAt(right)) {

            return false;
        }

        return isPalindrome(
            text,
            left + 1,
            right - 1
        );
    }

    public static void main(String[] args) {

        String text = "madam";

        System.out.println(
            isPalindrome(
                text,
                0,
                text.length() - 1
            )
        );
    }
}