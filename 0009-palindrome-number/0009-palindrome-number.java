class Solution {
    public boolean isPalindrome(int x) {
        boolean found=false;
        int num=x;
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(num==rev){
            found= true;
        }
        if(num<0){
            found= false;
        }
        return found;
    }
}