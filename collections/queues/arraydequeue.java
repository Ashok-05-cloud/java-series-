import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Java");
        deque.offerLast("Python");
        deque.offerLast("C++");

        System.out.println(deque);
    }
}