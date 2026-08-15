import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str = "JAVA";

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}