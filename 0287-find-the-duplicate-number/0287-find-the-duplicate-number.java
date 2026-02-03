class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int slow=0;
        int dup=0;
        for(int fast=1;fast<=nums.length-1;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
            }
            if(nums[fast]==nums[slow]){
                dup=nums[fast];

            }
        }
        return dup;  
    }
}