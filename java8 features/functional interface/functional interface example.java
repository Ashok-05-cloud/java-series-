@FunctionalInterface
interface Greeting {

    void sayHello();
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Greeting greeting =
                () -> System.out.println("Hello Ashok");

        greeting.sayHello();
    }
}