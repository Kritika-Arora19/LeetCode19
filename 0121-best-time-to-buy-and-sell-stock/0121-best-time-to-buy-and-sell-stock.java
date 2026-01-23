class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,tempro=0,buy=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<buy)
            buy=prices[i];
            else
            tempro=prices[i]-buy;
            if(tempro>pro)
            pro=tempro;
        }
        return pro;
    }
}