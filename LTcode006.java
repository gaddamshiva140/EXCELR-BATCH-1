import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("Original array: " + Arrays.toString(nums));
        int newLength = solution.removeDuplicates(nums);
        System.out.println("Array with unique elements: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("Length of unique array: " + newLength);
    }
}
