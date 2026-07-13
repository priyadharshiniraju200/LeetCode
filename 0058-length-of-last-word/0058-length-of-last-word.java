class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int ln=str[str.length-1].length();
        return ln;
    }
}