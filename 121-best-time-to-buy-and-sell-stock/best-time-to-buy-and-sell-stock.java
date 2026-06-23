class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
             min=Math.min(prices[i],min);
             max=Math.max(max,prices[i]-min);
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
        
    }
}