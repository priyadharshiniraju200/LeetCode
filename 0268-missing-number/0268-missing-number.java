class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectsum=n*(n+1)/2;
        int actsum=0;
        for(int num:nums){
            actsum+=num;
        }
        return expectsum-actsum;
    }
}