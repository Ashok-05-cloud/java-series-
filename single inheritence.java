class Animal {

    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();   // Inherited
        d.bark();    // Own method
    }
}
