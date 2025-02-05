package Class3;

import java.util.HashMap;

public class HashingFn {
    public static void main(String[] ar) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map.get("A"));
        System.out.println(map.isEmpty());
        System.out.println(map.remove("B"));
        System.out.println(map.containsKey("B"));
        map.put("B", 2);
        System.out.println(map.containsKey("B"));
    }

}
