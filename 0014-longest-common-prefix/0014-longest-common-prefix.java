class Solution {

    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<prefix.length();i++){
            for(String word:strs){
                if(i==word.length() || prefix.charAt(i)!=word.charAt(i)){
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
}