// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit = 0;
//         int buyPrice = prices[0];
//         for(int i = 1; i<prices.length;i++){
//             //profit
//             if(buyPrice<prices[i]){
//                 int currP = prices[i]-buyPrice;
//                 profit = Math.max(profit,currP);
//             }
//             else{
//                 buyPrice = prices[i];
//             }            
//         }
//     return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        // int bp = prices[0];
        int profit = 0;
        int min_so_far = prices[0];
        for(int i=1;i<prices.length;i++){
            //find min so far
            min_so_far = Math.min(prices[i], min_so_far);
            profit = Math.max(profit, prices[i] - min_so_far);
        }
        return profit;
    }
}
