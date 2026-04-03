class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        /*System.out.print("[");
        for(int i=0;i<s.length;i++){
            System.out.print("\""+s[i]+"\"");
            if(i!=s.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");*/
    }
}