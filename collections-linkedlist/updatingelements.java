import java.util.LinkedList;

public class UpdateElements {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");

        cities.set(1, "Hyderabad");

        System.out.println(cities);
    }
}
