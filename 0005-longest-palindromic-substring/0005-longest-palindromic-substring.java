class Solution {
    public String longestPalindrome(String s) {
        String rev="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s,i,j-1)){ 
                    if(j-i>rev.length()){
                        rev=s.substring(i,j);
                    }
                    
                }
            }
        }
        return rev;
    }
    public boolean isPalindrome(String s,int left,int right){
       while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}