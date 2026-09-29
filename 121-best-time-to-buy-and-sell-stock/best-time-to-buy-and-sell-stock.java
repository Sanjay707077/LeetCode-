class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0; 
        int r = 0;  
        int minPrice = prices[0]; 
        for(int i = 1; i < prices.length; i++)
        {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else {
                r = prices[i] - minPrice;
                if (sum < r) {
                    sum = r;
                }
            }
        }
        return sum;
    }
}
