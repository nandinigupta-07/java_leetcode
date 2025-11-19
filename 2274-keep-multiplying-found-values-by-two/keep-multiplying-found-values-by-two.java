class Solution {
    public int findFinalValue(int[] nums, int original) {
        
         Arrays.sort(nums);
             for(int j=0;j<nums.length;j++){
                if(nums[j]==original){
                    nums[j]=nums[j]*2;
                    original=nums[j];
                }
             }
        
        return original;
    }
}