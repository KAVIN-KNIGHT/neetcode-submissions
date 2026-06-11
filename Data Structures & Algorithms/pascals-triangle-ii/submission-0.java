class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> p = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> r = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    r.add(1);
                } else {
                    r.add(
                        p.get(i - 1).get(j - 1) +
                        p.get(i - 1).get(j)
                    );
                }
            }

            p.add(r);
        }

        return p.get(rowIndex);
    }
}