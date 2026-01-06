class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int currsum=0;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            currsum+=diff;
            if(currsum<0){
                currsum=0;
            }
            max=Math.max(max,currsum);
        }
         
        return max;
    }
}