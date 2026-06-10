class Solution {
    public int lengthOfLastWord(String s) {
        String[] w = s.trim().split("\\s+");
        int n= w.length;
        return w[n-1].length();
    }
}