class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int j=0;j<s.length();j++){
            char i=s.charAt(j);
            if(i=='{'||i=='['||i=='('){
                st.push(i);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(i==')'&&top!='('||i==']'&&top!='['||i=='}'&&top!='{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}