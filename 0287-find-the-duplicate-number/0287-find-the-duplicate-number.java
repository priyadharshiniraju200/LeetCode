class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dup=0;
        int slow=0;
        for(int fast=1;fast<=nums.length-1;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
            }
            if(nums[fast]==nums[slow]){
                dup=nums[slow];
            }
        }
        return dup;  
    }
}