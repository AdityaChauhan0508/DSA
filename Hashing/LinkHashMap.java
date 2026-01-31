
import java.util.HashMap;
import java.util.LinkedHashMap;



public class LinkHashMap { // O(1) time complexity for get, put, and remove operations on average

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put(null, null);
        lhm.put("One", 1);
        lhm.put("Two", 2);  
        lhm.put("Three", 3);
        lhm.put("Four", 4);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("One", 1);
        hm.put("Two", 2);
        hm.put("Three", 3);
        hm.put("Four", 4);

        System.out.println("LinkedHashMap: " + lhm);
        System.out.println("HashMap: " + hm);
    }
}
