class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 is considered to appear before the array starts
        map.put(0, -1);

        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (map.containsKey(count)) {

                int previousIndex = map.get(count);

                int length = i - previousIndex;

       =

            
