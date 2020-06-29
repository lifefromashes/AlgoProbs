import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    

    public static void main(String[] args) {
        //key: employee numer, int
        //value: name (string)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kristin");
        map.put(2 , "Adrienne");
        map.put(3, "Tricia");
        var value = map.get(3);
        map.containsKey(3); //O(1)
        map.containsValue("Kristin"); //runs O(n)
        map.put(4, null);
        map.put(null, null);
        map.remove(null);

        System.out.println(map);

        for (var item : map.keySet()) 
            System.out.println(item);

        for(var item : map.entrySet())
            System.out.println(item.getValue());
    }
}