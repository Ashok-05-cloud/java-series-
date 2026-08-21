import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =
                new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator =
                numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            System.out.println(number);
        }
    }
}