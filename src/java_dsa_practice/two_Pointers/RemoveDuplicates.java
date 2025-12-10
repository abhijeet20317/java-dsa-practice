package java_dsa_practice.two_Pointers;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) {
                i++;             // move slow pointer
                nums[i] = nums[j]; // copy unique element
            }
        }

        return i + 1; // total unique elements count
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,2,3,4,4};

        int len = removeDuplicates(nums);

        System.out.println("Unique length: " + len);

        System.out.print("Unique elements: ");
        for(int k = 0; k < len; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
