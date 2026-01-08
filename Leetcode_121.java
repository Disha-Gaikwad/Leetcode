//Best time to buy and sell stocks
class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
       int max = 0;

       //update the minimum value seen so far, if we saw smaller value
       for(int i = 1; i < prices.length; i++){
           minSoFar = Math.min(minSoFar, prices[i]);
            //Update max if we get more profit
            max = Math.max(max, prices[i] - minSoFar);
        }
        return max;
    }  
}
