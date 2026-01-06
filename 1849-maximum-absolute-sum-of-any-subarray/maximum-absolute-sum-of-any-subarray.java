class Solution {
    public int maxAbsoluteSum(int[] nums) {
         int pos=0;
         int max=0;
         for(int i=0;i<nums.length;i++){
            pos+=nums[i];
            if(pos<0){
                pos=0;
            }
            max=Math.max(pos,max);
         }
         int sum=0;
         int max2=0;
         for(int i=0;i<nums.length;i++){
            if(sum>0){
                sum=0;
            }
            sum+=nums[i];
             
             

            max2=Math.min(sum,max2);
         }
         int ans=Math.max(max,Math.abs(max2));
         return ans;
    }
}