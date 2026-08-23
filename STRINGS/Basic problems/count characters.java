public class CountCharacters {

    public static void main(String[] args) {

        String text = "hello";

        for (int i = 0;
             i < text.length();
             i++) {

            System.out.println(
                text.charAt(i)
            );
        }
    }
}