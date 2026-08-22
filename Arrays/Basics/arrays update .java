public class ArrayUpdate {

    public static void main(String[] args) {

        int[] numbers = {
            10, 20, 30, 40, 50
        };

        numbers[2] = 100;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}