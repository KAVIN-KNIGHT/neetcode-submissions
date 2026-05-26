class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> m = new HashMap<>();
        for(char i: s.toCharArray())
        {
            m.put(i, m.getOrDefault(i,0)+1);
        }
        for(char i: t.toCharArray())
        {
            if(!m.containsKey(i))
            {
                return false;
            }
            m.put(i ,m.get(i)-1);
            if (m.get(i) == 0)
            {
                m.remove(i);
            }
        }
        return m.isEmpty();
    }
}
