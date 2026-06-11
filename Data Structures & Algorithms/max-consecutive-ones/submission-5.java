class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;int j=0;
        int maone = 0;
        int c=0;
        if(nums[i]==0)
        {
            i++;
        }
        while(i< nums.length && j<nums.length)
        {
            
           if(nums[j]==1)
           {
            c++;
            j++;
           }
           else
           { 
            j++;
            i=j;
            c=0;
           }
           maone= Math.max(c, maone);
        }
        return maone;
    }
}