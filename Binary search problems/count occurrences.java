public class CountOccurrences {

    static int first(
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
                right = mid - 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }

    static int last(
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
                left = mid + 1;

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

        int target = 20;

        int firstIndex =
            first(arr, target);

        int lastIndex =
            last(arr, target);

        if (firstIndex == -1) {

            System.out.println(0);

        } else {

            System.out.println(
                lastIndex - firstIndex + 1
            );
        }
    }
}