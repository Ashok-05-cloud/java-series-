import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentStream {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Ashok", 85),
            new Student("Rahul", 65),
            new Student("Kiran", 92),
            new Student("Anil", 55)
        );

        List<Student> passedStudents =
                students.stream()
                        .filter(s -> s.marks >= 60)
                        .collect(Collectors.toList());

        passedStudents.forEach(
                System.out::println
        );
    }
}