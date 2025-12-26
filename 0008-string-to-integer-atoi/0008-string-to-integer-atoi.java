class Solution {
    public int myAtoi(String s) {
        long num=0;
        int sign=1;
        boolean start=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ' && !start){
                continue;
            }
            if((ch=='+'||ch=='-')&&!start){
                if(ch=='-'){
                    sign=-1;
                }
                start=true;
                continue;
            }
            if(ch>='0'&&ch<='9'){
                start=true;
                num=num*10+(ch-'0');
                if(sign*num>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if(sign*num<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
                else{
                    break;
                }
        }
            return(int)(sign*num);
        
    }
}