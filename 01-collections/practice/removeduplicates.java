import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =
                new ArrayList<>(
                    Arrays.asList(
                        10, 20, 10, 30, 20, 40
                    )
                );

        HashSet<Integer> unique =
                new HashSet<>(numbers);

        System.out.println(unique);
    }
}