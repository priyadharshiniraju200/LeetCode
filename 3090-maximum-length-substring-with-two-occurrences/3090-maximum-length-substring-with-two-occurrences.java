class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
       }
       return max;
    }
}