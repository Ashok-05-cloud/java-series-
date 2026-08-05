class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println(super.name);
        System.out.println(this.name);
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}
