import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelectBySorting {
    public static void main(String[] args) {
        // Start and end times of activities
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Step 1: Create a 2D array to store activity information
        // Each row contains: [activity index, start time, end time]
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;        // Store activity index
            activities[i][1] = start[i]; // Store start time
            activities[i][2] = end[i];   // Store end time
        }

        // Step 2: Sort activities based on their end times
        // Using a lambda function for the comparator
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // Step 3: Select activities
        // Initialize a list to store the indices of selected activities
        ArrayList<Integer> ans = new ArrayList<>();

        // The first activity is always selected
        int maxAct = 1; // Counter for the maximum number of activities
        ans.add(activities[0][0]); // Add the first activity index to the answer list
        int lastEnd = activities[0][2]; // Track the end time of the last selected activity

        // Iterate through the rest of the activities
        for (int i = 1; i < end.length; i++) {
            // If the start time of the current activity is >= the end time of the last selected activity
            if (activities[i][1] >= lastEnd) {
                // Select the current activity
                maxAct++;
                ans.add(activities[i][0]); // Add its index to the answer list
                lastEnd = activities[i][2]; // Update the end time of the last selected activity
            }
        }

        // Step 4: Print the results
        System.out.println("Max activities = " + maxAct);
        // Print the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
