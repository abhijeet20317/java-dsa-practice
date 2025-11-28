//Find maximum sum of any subarray of size K = 3

package java_dsa_practice;

public class MaxSubarraySum {

	public static int maxSum(int[] arr, int k) {
		int windowSum = 0, maxSum = 0;

		// first window
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;

		// slide the window
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 7, 8, 1, 2, 8, 1 };
		System.out.println(maxSum(arr, 3)); // 16
	}
}

//Find maximum sum of any subarray of size K = 3
//Array = [4, 2, 1, 7, 8, 1, 2, 8, 1]
