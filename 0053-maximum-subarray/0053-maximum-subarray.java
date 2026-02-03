class Solution {
    public int maxSubArray(int[] nums) {
        int MSF=Integer.MIN_VALUE;
        int ME=0;
        for(int i=0;i<nums.length;i++){
            ME=ME+nums[i];
            if(MSF<ME){
                MSF=ME;
            }
            if(ME<0){
                ME=0;
            }
        }
        return MSF;
    }
}