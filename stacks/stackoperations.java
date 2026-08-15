import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek
        System.out.println("Top: " + stack.peek());

        // Pop
        System.out.println("Removed: " + stack.pop());

        System.out.println("After pop: " + stack);

        // Check empty
        System.out.println("Is empty? " + stack.isEmpty());
    }
}