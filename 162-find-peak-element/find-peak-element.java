class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0;
        int max=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max= Math.max(max,nums[i]);
                idx=i;
            }
         }
         return idx;
    }
}