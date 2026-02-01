class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        
        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of a sequence
                int currentNum = num;
                int streak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
                maxLen = Math.max(maxLen, streak);
            }
        }
        return maxLen;
        
    }
}