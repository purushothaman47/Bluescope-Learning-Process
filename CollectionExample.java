package Example;
import java.util.*;
public class CollectionExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        System.out.println("List: " + list);
        
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Red");
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jana");
        map.put(2, "Purushoth");
        map.put(3, "Bharath");
        System.out.println("Map: " + map);
    }
}
