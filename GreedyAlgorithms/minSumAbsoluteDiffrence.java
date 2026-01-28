import java.util.Arrays;

public class minSumAbsoluteDiffrence {

    public static void main(String[] args) {
        // Two arrays containing the elements to calculate minimum absolute difference
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        // Step 1: Sort both arrays in ascending order
        // Sorting ensures that the minimum absolute difference is achieved 
        // by pairing the smallest element of one array with the smallest of the other and so on.
        Arrays.sort(A);
        Arrays.sort(B);

        // Initialize a variable to store the sum of minimum absolute differences
        int minDiff = 0;

        // Step 2: Calculate the sum of absolute differences between the corresponding elements of A and B
        for (int i = 0; i < A.length; i++) {
            // Math.abs(A[i] - B[i]) gives the absolute difference between paired elements
            minDiff += Math.abs(A[i] - B[i]);
        }

        // Step 3: Print the result
        System.out.println("Min absolute Difference of Pairs = " + minDiff);
    }
}
