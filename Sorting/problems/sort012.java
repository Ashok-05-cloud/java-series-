public class Sort012 {

    public static void sort(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int number : arr) {

            if (number == 0) {
                count0++;
            } else if (number == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        while (count0-- > 0) {
            arr[index++] = 0;
        }

        while (count1-- > 0) {
            arr[index++] = 1;
        }

        while (count2-- > 0) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {

        int[] arr = {
            0, 2, 1, 2, 0, 1
        };

        sort(arr);

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}