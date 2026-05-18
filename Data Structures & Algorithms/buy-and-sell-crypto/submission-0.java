class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int left=0;
        int profit=0;
        for(int right=1;right<prices.length;right++){
            if(prices[right]>=prices[left]){
                profit=prices[right]-prices[left];
                if(profit>maxp){
                    maxp=profit;
                }
                
            }
            else if(prices[right]<prices[left]){
                left=right;
                
            }
             }
             return maxp;
    }
}
