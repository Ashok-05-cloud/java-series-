import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Course {

    String name;
    String category;

    Course(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupingByExample {

    public static void main(String[] args) {

        List<Course> courses = Arrays.asList(
            new Course("Java", "Programming"),
            new Course("Python", "Programming"),
            new Course("MySQL", "Database"),
            new Course("MongoDB", "Database")
        );

        Map<String, List<Course>> grouped =
                courses.stream()
                       .collect(
                           Collectors.groupingBy(
                               c -> c.category
                           )
                       );

        System.out.println(grouped);
    }
}