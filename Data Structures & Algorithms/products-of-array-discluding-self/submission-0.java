class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n= nums.length;
        int[]a = new int[n];
        
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=i+1;j<n;j++)
            {
                p*=nums[j];
            }
             for(int k=i-1;k>=0;k--)
            {
                p*=nums[k];
            }
            a[i]= p;
        }
        return a;
    }
}  
