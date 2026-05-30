class Solution {
    public int maxArea(int[] h) {
        int l= 0;
        int r= h.length-1;
        int m =0;
        while(l<r)
        {
            int w = r-l;
            int n = Math.min(h[l],h[r]);
            int area = w*n;
            m = Math.max(m, area);
            if(h[l]<=h[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return m;
    }
}
