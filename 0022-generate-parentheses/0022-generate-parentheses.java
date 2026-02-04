class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res =new ArrayList<>();
        Recursive("",0,0,n,res);
        return res;
        
    }
    public static void Recursive(String str,int op,int cp,int n,List<String> res){
        if(op+cp==2*n){
            res.add(str);
        }
        if(op<n){
            Recursive(str+"(",op+1,cp,n,res);
        }
        if(cp<op){
            Recursive(str+")",op,cp+1,n,res);
        }
    }
}