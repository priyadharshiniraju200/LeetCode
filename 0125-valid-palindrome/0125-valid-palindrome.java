import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String S=s.toLowerCase();
        int left=0;
        int right=S.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(S.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(S.charAt(right))){
                right--;
            }
            if(S.charAt(left)!=S.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}