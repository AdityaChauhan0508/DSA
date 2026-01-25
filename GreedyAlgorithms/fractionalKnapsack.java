
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    
    public static void main(String[] args) {
        // Values (profits) of items
        int val[] = {60, 100, 120};
        // Weights of items
        int weight[] = {10, 20, 30};
        // Total weight capacity of the knapsack
        int w = 50;

        // Array to store the index and value-to-weight ratio of each item
        double ratio[][] = new double[val.length][2];
        // 0th column -> index of the item
        // 1st column -> value-to-weight ratio of the item

        // Calculate value-to-weight ratio for each item
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; // Store the index
            ratio[i][1] = val[i] / (double) weight[i]; // Store the value-to-weight ratio
        }

        // Sort the items based on value-to-weight ratio in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // Initialize remaining capacity of the knapsack
        int capacity = w;
        // Variable to store the final maximum value
        int finalVal = 0;

        // Start picking items from the highest value-to-weight ratio
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0]; // Get the original index of the item
            if (capacity >= weight[idx]) {
                // If the current item's weight fits completely in the remaining capacity,
                // add its full value to the final value
                finalVal += val[idx];
                capacity -= weight[idx]; // Reduce the remaining capacity
            } else {
                // If the current item can't fit completely, take the fractional part
                // Add the proportional value to the final value
                finalVal += (ratio[i][1] * capacity);
                break; // No more capacity left, so break the loop
            }
        }

        // Print the final maximum value of items that can be included in the knapsack
        System.out.println("Final Value = " + finalVal);
    }
}
