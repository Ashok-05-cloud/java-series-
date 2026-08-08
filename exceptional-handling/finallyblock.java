public class FinallyExample {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
