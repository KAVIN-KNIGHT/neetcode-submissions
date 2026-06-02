class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int n = m.length ;
        int k = m[0].length;
        int l = 0;
        int r = n * k -1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            int row = mid / k;
            int col = mid % k;
            if(m[row][col]== t)
            {
                return true;
            }
            else if(t>m[row][col])
            {
                l = mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return false;
    }
}
