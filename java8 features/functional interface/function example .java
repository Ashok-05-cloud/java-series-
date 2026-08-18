import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> square =
                number -> number * number;

        System.out.println(square.apply(5));
    }
}