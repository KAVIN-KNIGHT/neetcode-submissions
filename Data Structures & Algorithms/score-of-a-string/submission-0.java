class Solution {
    public int scoreOfString(String s) {
        int n= s.length();
        int mi =0;
        for(int i=0;i<n-1;i++)
        {
            int a= (int)s.charAt(i);
            int b= (int)s.charAt(i+1);
            mi+= Math.abs(b-a);
        }
        return mi;
    }
}