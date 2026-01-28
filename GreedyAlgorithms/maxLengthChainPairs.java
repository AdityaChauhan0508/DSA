import java.util.Arrays;
import java.util.Comparator;

public class maxLengthChainPairs {
    
    public static void main(String[] args) {
        // Array of pairs where each pair is represented as [start, end]
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        // Step 1: Sort the pairs based on the second value (end time) of each pair
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        // Step 2: Initialize the length of the chain and set the end of the first selected pair
        int chainLen = 1; // At least one pair can always form a chain
        int chainEnd = pairs[0][1]; // End time of the first selected pair

        // Step 3: Iterate through the pairs to find the maximum chain length
        for (int i = 1; i < pairs.length; i++) {
            // If the start time of the current pair is greater than the end time of the last selected pair
            if (pairs[i][0] > chainEnd) {
                chainLen++;             // Increment the chain length
                chainEnd = pairs[i][1]; // Update the end time to the current pair's end time
            }
        }

        // Step 4: Print the maximum length of the chain
        System.out.println("Max length of chain = " + chainLen);
    }
}
