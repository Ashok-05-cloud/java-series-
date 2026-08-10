public class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Ashok");

        System.out.println("Name: " + s.name);
    }
}
