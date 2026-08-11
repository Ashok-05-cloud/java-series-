import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Mumbai");

        System.out.println(cities);
    }
}
