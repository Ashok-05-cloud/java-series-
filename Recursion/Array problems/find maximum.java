public class FindMaximum {

    static int maximum(
            int[] arr,
            int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxOfRest =
            maximum(arr, index + 1);

        return Math.max(
            arr[index],
            maxOfRest
        );
    }

    public static void main(String[] args) {

        int[] arr = {
            10, 50, 20, 80, 30
        };

        System.out.println(
            maximum(arr, 0)
        );
    }
}