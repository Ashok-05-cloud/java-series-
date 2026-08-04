class Student {
    // Private fields
    private String name;
    private int rollNo;
    private String branch;
    private double marks;

    // Setter method
    public void setStudentDetails(String name, int rollNo, String branch, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.marks = marks;
    }

    // Getter method
    public void getStudentDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch : " + branch);
        System.out.println("Marks  : " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        // Create 3 student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Store details
        s1.setStudentDetails("Ashok", 101, "CSE", 92.5);
        s2.setStudentDetails("Rahul", 102, "ECE", 88.0);
        s3.setStudentDetails("Priya", 103, "IT", 95.2);

        // Display details
        System.out.println("Student Details");
        System.out.println("================");
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}
