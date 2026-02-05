class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int res[]=new int[n];
        Arrays.fill(res,-1);
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            if(i<n){
                res[i]=st.isEmpty() ? -1:st.peek();
            }
            st.push(nums[index]);
        }
        return res;
    }
}