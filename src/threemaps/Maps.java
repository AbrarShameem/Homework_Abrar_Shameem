package threemaps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
public class Maps {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"India, Bangladesh, Pakistan, Afghanistan");
        map.put(2, "Saudi Arabia, Yemen, Jordan, Lebanon");
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println("Saudi Arabia, Yemen, Jordan, Lebanon");
            System.out.println("India, Bangladesh, Pakistan, Afghanistan");
        }
        for (Integer key: map.keySet()) {
            System.out.println(key);
        }
        map.keySet().iterator()
                .forEachRemaining(System.out::println);
        map.keySet().stream()
                .forEach(System.out::println);
        Stream.of(map.keySet().toArray())
                .forEach(System.out::println);
        System.out.println(map.keySet().toString());
        Stream.of(map.keySet().toString())
                .forEach(System.out::println);
    }

}
