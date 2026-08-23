public class ReverseString {

    public static void main(String[] args) {

        String text = "Java";

        StringBuilder sb =
                new StringBuilder(text);

        System.out.println(
            sb.reverse()
        );
    }
}