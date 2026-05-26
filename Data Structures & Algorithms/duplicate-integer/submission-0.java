class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i : nums)
        {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int word : m.keySet()) 
        {
            if (m.get(word) > 1) {
                return true;
               
            }
        }
        return false ;
    }
}