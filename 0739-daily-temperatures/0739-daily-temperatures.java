class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                int previndex=st.pop();
                res[previndex]=i-previndex;
                }
            st.push(i);
        }
        return res;
    }
}