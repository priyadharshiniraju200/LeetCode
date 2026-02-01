class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // Add all numbers to set
        
        int maxLen = 0;
        for (int num : set) {
            // Only start counting if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;
                
                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
                maxLen = Math.max(maxLen, streak);
            }
        }
        return maxLen;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + sol.longestConsecutive(nums1));
        // Output: 4 (sequence: 1,2,3,4)

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest consecutive sequence length: " + sol.longestConsecutive(nums2));

        
    }
}