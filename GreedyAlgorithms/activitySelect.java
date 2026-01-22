import java.util.ArrayList;

public class activitySelect {
    public static void main(String[] args) {
        // Start and end times of activities
        int start[] = {1, 3, 0, 5, 8, 5}; // Start times of activities
        int end[] = {2, 4, 6, 7, 9, 9};   // End times of activities (already sorted)

        // Step 1: Create a list to store the indices of selected activities
        ArrayList<Integer> ans = new ArrayList<>();

        // Step 2: Initialize the number of maximum activities
        int maxAct = 1; // The first activity is always selected
        ans.add(0);     // Add the first activity (index 0) to the answer list
        int lastEnd = end[0]; // Track the end time of the last selected activity

        // Step 3: Iterate through the activities to select non-overlapping ones
        for (int i = 1; i < end.length; i++) {
            // Check if the start time of the current activity is greater than or equal
            // to the end time of the last selected activity
            if (start[i] >= lastEnd) {
                // Select the current activity
                maxAct++;
                ans.add(i);        // Add its index to the answer list
                lastEnd = end[i];  // Update the end time of the last selected activity
            }
        }

        // Step 4: Print the results
        System.out.println("Max activities = " + maxAct);
        // Print the indices of the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
