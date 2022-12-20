import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // Set<Integer> values = new HashSet<>();
        Set<Integer> values = new TreeSet<>();
        System.out.println(values.add(5));
        values.add(2);
        values.add(9);
        System.out.println(values.add(6));

        for(int i : values)
        {
            System.out.println(i);
        }

    }
}
