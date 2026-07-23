class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int pro=0;
        for(int i=0;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            if(prices[i] > min){
                pro = prices[i]-min;
            }
            max = Math.max(max,pro);
        }
        return max;
    }
}
