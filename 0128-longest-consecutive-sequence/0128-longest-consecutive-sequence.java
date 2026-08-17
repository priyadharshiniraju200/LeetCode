class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxlen=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int currnum=n;
                int count=1;
                while(set.contains(currnum+1)){
                    currnum++;
                    count++;
                }
                maxlen=Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
}