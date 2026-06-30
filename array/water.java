class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            // Width between the two lines
            int width = right - left;

            // Height of water = shorter line
            int h = Math.min(height[left], height[right]);

            // Calculate area
            int area = width * h;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
