import java.util.Stack;

public class BrowserHistory {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");

        System.out.println("Current: " + history.peek());

        history.pop();

        System.out.println("After Back: " + history.peek());
    }
}