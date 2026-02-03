class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dup=0;
        for(int fast=0;fast<nums.length-1;fast++){
            if(nums[fast]==nums[fast+1]){
                dup=nums[fast];

            }
        }
        return dup;  
    }
}