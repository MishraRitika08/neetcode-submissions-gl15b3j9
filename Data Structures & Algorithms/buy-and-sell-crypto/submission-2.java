class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for(int i = 1; i<prices.length;i++){
            //profit
            if(buyPrice<prices[i]){
                int currP = prices[i]-buyPrice;
                profit = Math.max(profit,currP);
            }
            else{
                buyPrice = prices[i];
            }            
        }
    return profit;
    }
}
