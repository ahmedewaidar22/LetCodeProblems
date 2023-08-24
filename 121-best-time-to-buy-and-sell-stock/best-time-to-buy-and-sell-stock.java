class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int rigth=1;
        int maxProfit=0;
        while(rigth<prices.length){
            if(prices[left]<prices[rigth]){
                maxProfit=Math.max(maxProfit,prices[rigth]-prices[left]);
                rigth++;
            }else{
                left=rigth;
                rigth++;
            }

        }
        
        return maxProfit;
        
    }
}