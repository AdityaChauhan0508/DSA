
import java.util.HashSet;

public class myHashSet {

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(1);
        set.add(6);
        
        System.out.println(set);

        if(set.contains(3)) {
            System.out.println("Set contains 3");
        } else {
            System.out.println("Set does not contain 3");
        }

        System.out.println("Size of set = " + set.size());
        System.out.println("Is the set empty? " + set.isEmpty());
    
        set.clear();
        System.out.println("After clearing, is the set empty? " + set.isEmpty());
        System.out.println("After clearing set, size of set = "+set.size());
    }
    
}
