class Solution {
    public int trap(int[] h) {
        int l = 0;
        int r =  h.length -1;
        int ml = h[l];
        int mr = h[r];
        int a=0;
        while(l<r)
        {
            if(ml<= mr)
            {
                l++;
                ml=  Math.max(ml,h[l]);
                a+=ml-h[l];
            }
            else
            {
                r--;
                mr=  Math.max(mr,h[r]);
                a+=mr-h[r];
            }
        }
        return a;
    }
}
