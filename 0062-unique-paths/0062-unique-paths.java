class Solution {
    public static int utility(int m,int n,int table[][]){
        if(m==1 || n==1){
            return table[m][n]=1;
        }
        if(table[m][n]!=-1){
            return table[m][n];
        }
        return table[m][n]=utility(m-1,n,table)+utility(m,n-1,table);
    }
    public int uniquePaths(int m, int n) {
        int table[][]=new int[m+1][n+1];
        for(int r[]:table){
            Arrays.fill(r,-1);
        }
        int result= utility(m,n,table);
        return result;
    }
}