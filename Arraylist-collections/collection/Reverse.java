import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =
            new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Collections.reverse(numbers);

        System.out.println(numbers);
    }
}