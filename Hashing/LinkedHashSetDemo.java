import java.util.*;

public class LinkedHashSetDemo {
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Banglore");
        cities.add("Noida");
        System.out.println(cities);

        java.util.LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kolkata");
        lhs.add("Pune");
        lhs.add("Delhi"); // Duplicate, will not be added values print in insertion order
        lhs.add("Mumbai");
        System.out.println(lhs);

    }
}
