//Question 3 — Maximum Sum Subarray of Size K

//  input
//arr = [2, 1, 5, 1, 3, 2]
//k = 3

//output
//  9


package java_dsa_practice;

public class MaxSumSubarraySizeK {
	 public static int maxSum(int[] arr, int k) {

	        int windowSum = 0;
	        int maxSum = 0;

	        // Step 1: Find sum of first window
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        maxSum = windowSum;

	        // Step 2: Slide the window
	        for (int end = k; end < arr.length; end++) {
	            windowSum += arr[end];        // add new element
	            windowSum -= arr[end - k];    // remove outgoing element

	            maxSum = Math.max(maxSum, windowSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1};
	        int k = 3;

	        System.out.println("Maximum sum of subarray size " + k + " = " + maxSum(arr, k));
	    }

}
