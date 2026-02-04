import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int count = 0;

        while (i < nums.length && j < nums.length) {

            if (i == j || nums[j] - nums[i] < k) {
                j++;
            }
            else if (nums[j] - nums[i] > k) {
                i++;
            }
            else { // diff == k
                count++;
                i++;
                j++;
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }

        return count;
    }
}


  