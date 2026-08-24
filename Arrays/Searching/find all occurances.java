public class FindAllOccurrences {

    public static void main(String[] args) {

        int[] arr = {
            10, 20, 10, 30, 10
        };

        int target = 10;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println(
                    "Found at index: " + i
                );
            }
        }
    }
}