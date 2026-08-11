public class Student {

    String name;

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ashok";

        s1.display();
    }
}
