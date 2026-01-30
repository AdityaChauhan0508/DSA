import java.util.HashMap;

public class itineraryForTickets { //O(n) time complexity, O(n) space complexity

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();
        
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }
        
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key; // This is the starting point
            }
        }
        
        return null; // No starting point found
    }
    

    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.println("Starting point: " + start);

        for(String key : tickets.keySet()) {
            System.out.println(key + " -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }

}