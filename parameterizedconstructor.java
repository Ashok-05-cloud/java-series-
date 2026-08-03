public class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ashok",21);

        s1.display();
    }
}
