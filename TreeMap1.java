// import java.security.spec.MGF1ParameterSpec;
import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(1000,"Tom");
        map.put(2000,"Jayesh");
        map.put(1500,"Mahesh");
        map.put(200,"Satish");
        map.put(2500,"Amit");

        System.out.println(map);

        map.forEach((k,v) -> System.out.println("Key = "+k+" Value = "+v));
        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        Set<Integer> keyLessThan2k = map.headMap(2000).keySet();
        System.out.println(keyLessThan2k);

        Set<Integer> keyGreaterThan2k = map.tailMap(2000).keySet();
        System.out.println(keyGreaterThan2k);
    }
}
