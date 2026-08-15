import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);
    }
}