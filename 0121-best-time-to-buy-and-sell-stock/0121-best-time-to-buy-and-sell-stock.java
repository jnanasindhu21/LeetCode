class Solution {
    public int maxProfit(int[] prices) {
        int mp=0,ms=prices[0];
        for(int i=0; i<prices.length; i++)
        {
            ms=Math.min(ms,prices[i]);
            int p = prices[i] - ms;
            mp = Math.max(p,mp);
        }
     
        return mp ;
        //return (s-b);
    }
}