import java.util.*;

public class indianCoins {
    
    public static void main(String[] args) {
        Integer coins[] = {2000,500,100,50,20,10,5,2,1}; // Change int[] to Integer[]

        //Sort in descending order **This method does not work due to version does'nt support that's why manually sorted**
        // Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0; // To count the total number of coins used
        int amount = 1059; // Target amount

        ArrayList<Integer> ans = new ArrayList<>(); // To store the selected coins
        // Iterate over the sorted coins array
        for (Integer coin : coins) {  //int i = 0; i < coins.length; i++ ->(the for loop used is more optimal than this)
            //int i = 0; i < coins.length; i++
            // If the current coin can be used for the remaining amount
            if (coin <= amount) {
                // Use the coin as many times as possible
                while (coin <= amount) {
                    countOfCoins++; // Increment the coin count
                    ans.add(coin); // Add the coin to the result list
                    amount -= coin; // Decrease the remaining amount
                }
            }
        }

        // Print the results
        System.out.println("Total min coins used = " + countOfCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
