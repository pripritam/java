// A HashMap is a data structure that stores data in key-value pairs.

// Think of it like a dictionary:

// Key        Value
// ----------------
// apple   →  0.50
// banana  →  7.30
// coconut →  8.30
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
       HashMap<String,Double> map=new HashMap<>(); 
        map.put("apple", 0.50);
        map.put("ba", 7.3);
        map.put("cocount", 8.3);
        // map.remove("ba");
        // System.out.println(map);
        // System.out.println(map.get("apple"));
        //  System.out.println(map.containsKey("apple"));
        // System.out.println(map.containsValue(8.3));
        // System.out.println(map.size());

        for (String key : map.keySet()) {
    System.out.println(key + " = " + map.get(key));
                                        }

    }
    
}
