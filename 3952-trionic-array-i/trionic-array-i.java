class Solution {
    public boolean isTrionic(int[] nums) {
         int n=nums.length;
         if(n<4) return false;
         int p=0;
         int q=0;
         int idx=0;
         if(nums[0]==nums[1])return false;
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return false;
            if(nums[i]>nums[i+1] ){
                p=i;
                idx=i;
                break;
            }
         }
         for(int i=idx+1;i<nums.length-1;i++){
             if(nums[i]==nums[i+1]) return false;
            if(nums[i]<nums[i+1] ){
                q=i;
                idx=i;
                break;
            }
         }
         for(int i=idx+1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return false;
            if(nums[i]>nums[i+1]){
                return false;
            }
         }
         if(0<p && p<q && q<n-1){
            return true;
         }
         return false;
    }
}














