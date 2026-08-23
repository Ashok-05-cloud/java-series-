public class ReverseString {

    public static void main(String[] args) {

        String text = "Java";

        StringBuilder result =
                new StringBuilder();

        for (int i = text.length() - 1;
             i >= 0;
             i--) {

            result.append(text.charAt(i));
        }

        System.out.println(result);
    }
}