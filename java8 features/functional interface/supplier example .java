import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> message =
                () -> "Java is powerful";

        System.out.println(message.get());
    }
}