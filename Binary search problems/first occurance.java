public class FirstOccurrence {

    public static int firstOccurrence(
            int[] arr,
            int target) {

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid =
                left + (right - left) / 2;

            if (arr[mid] == target) {

                answer = mid;

                // Search further left
                right = mid - 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {
            10, 20, 20, 20, 30, 40
        };

        System.out.println(
            firstOccurrence(arr, 20)
        );
    }
}