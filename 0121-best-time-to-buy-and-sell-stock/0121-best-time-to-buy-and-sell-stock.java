class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int[] left = new int[prices.length]; 
        int[] right = new int[prices.length]; 
        left[0] = prices[0];
        right[prices.length - 1] = prices[prices.length - 1];

       
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.min(left[i - 1], prices[i]);
        }

        
        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], prices[i]);
        }

        
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, right[i] - left[i]);
        }

        return maxProfit;
    }
}