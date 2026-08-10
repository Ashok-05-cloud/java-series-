class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v = new Bike();

        v.start();
    }
}
