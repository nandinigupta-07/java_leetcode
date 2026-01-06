class Solution {
    public int maxSubarraySumCircular(int[] nums) {
          int sum=0;
          int max=nums[0];
          int uu=0;
          for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            uu+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
          }
          int min=Integer.MAX_VALUE;
          int sum2=0;
          for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
            min=Math.min(min,sum2);
            if(sum2>0){
                sum2=0;
            }
          }

          if(max<0) return max;
          int ans=Math.max(max,uu -min);
          return ans;
    }
}