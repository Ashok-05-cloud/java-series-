public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            arr[5] = 10;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }
        catch (Exception e) {
            System.out.println("Some Other Exception");
        }
    }
}
