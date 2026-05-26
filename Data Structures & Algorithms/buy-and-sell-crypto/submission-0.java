class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int minprice = 1000;
        for(int i : prices)
        {
            minprice = Math.min(minprice,i);
            int p = i- minprice;
            mp = Math.max(mp, p);
        }
        return mp;
        
    }
}
