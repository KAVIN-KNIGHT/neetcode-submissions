class Solution {
    public int search(int[] n, int t) {
        int l= 0;
        int r= n.length -1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(t ==n[mid])
            {
                return mid;
            }
            if(n[l] <= n[mid])
            {
                if(t< n[mid] && t>= n[l])
                {
                    r= mid-1;

                }
                else
                {
                    l=mid+1;
                }
            }
            else
            {
               if(t> n[mid] && t<= n[r])
                {
                    l= mid+1;

                }
                else
                {
                    r=mid-1;
                } 
            }
        }
        return -1;
    }
}
