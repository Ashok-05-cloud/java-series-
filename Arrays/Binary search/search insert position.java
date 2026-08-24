public class SearchInsertPosition {

    public static int searchInsert(
            int[] arr,
            int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {

            int mid =
                left + (right - left) / 2;

            if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] arr = {
            1, 3, 5, 6
        };

        System.out.println(
            searchInsert(arr, 2)
        );
    }
}