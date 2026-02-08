// Top 50 OA
// Nomaan Faruki

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int profit= prices[i]-min;
            maxProfit=Math.max(profit,maxProfit);
            min=Math.min(prices[i],min);
            
        }

        return maxProfit;
            
    }
        
}
