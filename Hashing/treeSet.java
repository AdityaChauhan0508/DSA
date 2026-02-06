
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeSet {
    
    public static void main(String[] args) {
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");   
        ts.add("Banglore");
        ts.add("Noida");

        System.out.println(ts); // Prints in sorted ascending order
        // Output: [Banglore, Delhi, Mumbai, Noida]

        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Banglore");
        hs.add("Noida");
        System.out.println(hs); // Prints in random order
        // Output: [Banglore, Delhi, Mumbai, Noida] (order may vary)

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");  
        lhs.add("Banglore");
        lhs.add("Noida");
        System.out.println(lhs); // Prints in insertion order
        // Output: [Delhi, Mumbai, Banglore, Noida]
    }
}
