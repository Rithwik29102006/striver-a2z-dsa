class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

