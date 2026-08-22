public class LinearSearch {

    public static int search(
            int[] numbers,
            int target) {

        for (int i = 0;
             i < numbers.length;
             i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {
            10, 20, 30, 40, 50
        };

        int target = 30;

        int index =
                search(numbers, target);

        System.out.println(
            "Index = " + index
        );
    }
}