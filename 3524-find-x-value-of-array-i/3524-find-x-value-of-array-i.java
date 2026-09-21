class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res=new long[k];
        long[] dp=new long[k];
        for(int num:nums){
            int mod=num%k;
            long ndp[]=new long[k];
            ndp[mod]=1;
            for(int i=0;i<k;i++){
                int nr=(i*mod)%k;
                ndp[nr]+=dp[i];
            }
            for(int i=0;i<k;i++){
                res[i]+=ndp[i];
            }
            dp=ndp;
        }
        return res;
    }
}