
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (char d : ransomNote.toCharArray()) {
            if (!m.containsKey(d) || m.get(d) == 0) {
                return false;
            }

            m.put(d, m.get(d) - 1);
        }

        return true;
    }
}