import java.util.*;

public class treeMap {
    

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        tm.put("Russia", 75);

        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Russia", 75);

        System.out.println("TreeMap: " + tm);
        System.out.println("HashMap: " + hm);
    }
}
