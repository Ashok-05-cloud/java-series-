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

public class StudentAnalysis {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Ashok", 85),
            new Student("Rahul", 65),
            new Student("Kiran", 92),
            new Student("Anil", 35),
            new Student("Arjun", 75)
        );

        // Students who passed
        List<Student> passed =
                students.stream()
                        .filter(s -> s.marks >= 40)
                        .collect(Collectors.toList());

        System.out.println("Passed:");
        passed.forEach(System.out::println);

        // Highest marks
        Student topper =
                students.stream()
                        .max((s1, s2) ->
                            Integer.compare(
                                s1.marks,
                                s2.marks
                            )
                        )
                        .orElse(null);

        System.out.println("\nTopper:");
        System.out.println(topper);

        // Average marks
        double average =
                students.stream()
                        .mapToInt(s -> s.marks)
                        .average()
                        .orElse(0);

        System.out.println(
            "\nAverage: " + average
        );

        // Names sorted alphabetically
        List<String> names =
                students.stream()
                        .map(s -> s.name)
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(
            "\nSorted Names: " + names
        );
    }
}