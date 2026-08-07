interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}
