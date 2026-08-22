public class FindMaximum {

    public static void main(String[] args) {

        int[] numbers = {
            10, 50, 20, 80, 30
        };

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];
            }
        }

        System.out.println(
            "Maximum = " + max
        );
    }
}