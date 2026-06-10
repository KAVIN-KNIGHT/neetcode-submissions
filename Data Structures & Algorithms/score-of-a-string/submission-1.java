class Solution {
    public int scoreOfString(String s) {
      
        int mi =0;
        for(int i=0;i<s.length()-1;i++)
        {
            
            mi+= Math.abs((int)s.charAt(i+1)-(int)s.charAt(i));
        }
        return mi;
    }
}