import java.util.*;

public class myHashMap { // O(1) time complexity for get and put operations on average
    
    public static void main(String[] args) {
        
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        //HashMap Operations

        //inserting key-value pairs O(1)
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);  

        System.out.println("Initial HashMap: " + map);

        // GET() Accessing a value by key O(1)
        System.out.println("Value for key 'Two': " + map.get("Two"));

        //ContainsKey() Checking if a key exists O(1)
        System.out.println("Does key 'One' exist? " + map.containsKey("One"));
        System.out.println("Does key 'Five' exist? " + map.containsKey("Five"));

        //Removing a key-value pair O(1)
        map.remove("Two");
        System.out.println("After removing key 'Two': " + map);

        map.clear();
        //isEmpty() Checking if the map is empty O(1)
        System.out.println("Is the map empty? " + map.isEmpty());
        

    }
}
