package java_dsa_practice.two_Pointers;

public class TwoPointerPairSum {

    public static int[] findPair(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                // return 1-based indexes (interview friendly)
                return new int[]{left + 1, right + 1};
            }

            if (sum < target) {
                left++;       // increase sum
            } else {
                right--;      // decrease sum
            }
        }

        return new int[]{-1, -1};  // pair not found
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 8, 11, 15};
        int target = 18;

        int[] ans = findPair(arr, target);

        System.out.println("Pair indexes: (" + ans[0] + ", " + ans[1] + ")");
    }
}

