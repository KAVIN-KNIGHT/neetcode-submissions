class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> m= new HashMap<>();
        for(int i : nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        } 
        for(int i : m.values())
        {
            if(i>1)
            {
                return true;
            }
        }
        return false;
    }
}