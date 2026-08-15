import java.util.Vector;
import java.util.Enumeration;

public class EnumerationExample {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("Ashok");
        names.add("Rahul");
        names.add("Kiran");

        Enumeration<String> e = names.elements();

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());
        }
    }
}