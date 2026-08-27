public class CountOccurrences {

    static int count(
            int[] arr,
            int index,
            int target) {

        if (index == arr.length) {
            return 0;
        }

        int current =
            arr[index] == target ? 1 : 0;

        return current +
               count(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 4};

        System.out.println(
            count(arr, 0, 2)
        );
    }
}