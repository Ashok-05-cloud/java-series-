import java.util.ArrayList;

public class PrintSubsets {

    static void printSubsets(
            int[] arr,
            int index,
            ArrayList<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // 1. Include current element
        current.add(arr[index]);

        printSubsets(
            arr,
            index + 1,
            current
        );

        // Backtrack / Undo
        current.remove(current.size() - 1);

        // 2. Exclude current element
        printSubsets(
            arr,
            index + 1,
            current
        );
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        ArrayList<Integer> current =
            new ArrayList<>();

        printSubsets(arr, 0, current);
    }
}