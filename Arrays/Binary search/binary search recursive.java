public class BinarySearchRecursive {

    public static int search(
            int[] arr,
            int left,
            int right,
            int target) {

        if (left > right) {
            return -1;
        }

        int mid =
            left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {

            return search(
                arr,
                mid + 1,
                right,
                target
            );

        } else {

            return search(
                arr,
                left,
                mid - 1,
                target
            );
        }
    }

    public static void main(String[] args) {

        int[] arr = {
            10, 20, 30, 40, 50
        };

        int result =
            search(
                arr,
                0,
                arr.length - 1,
                40
            );

        System.out.println(result);
    }
}