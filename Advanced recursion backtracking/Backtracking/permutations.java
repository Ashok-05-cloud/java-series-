public class Permutations {

    static void generate(
            String str,
            String current) {

        if (str.length() == 0) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining =
                str.substring(0, i)
                + str.substring(i + 1);

            generate(
                remaining,
                current + ch
            );
        }
    }

    public static void main(String[] args) {

        generate("ABC", "");
    }
}