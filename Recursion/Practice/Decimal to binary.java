public class DecimalToBinary {

    static void binary(int n) {

        if (n == 0) {
            return;
        }

        binary(n / 2);

        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        int n = 10;

        if (n == 0) {
            System.out.println(0);
        } else {
            binary(n);
        }
    }
}