class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            if (curr < 0) {
                int temp = maxEnd;
                maxEnd = minEnd;
                minEnd = temp;
            }

            maxEnd = Math.max(curr, maxEnd * curr);
            minEnd = Math.min(curr, minEnd * curr);

            maxSoFar = Math.max(maxSoFar, maxEnd);
        }

        return maxSoFar;
    }
}