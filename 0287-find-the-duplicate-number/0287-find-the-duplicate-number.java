class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int fast=0;fast<nums.length-1;fast++){
            if(nums[fast]==nums[fast+1]){
                return nums[fast];
            }
            
        }
        return 0;  
    }
}