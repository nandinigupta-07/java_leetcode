class Solution {
    public int minimumCost(int[] nums) {
        int ans=Integer.MAX_VALUE;
        
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        }
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<ans){
                ans=nums[i];
                 idx=i;
            }
        }
        int max=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max && i!=idx){
                max=nums[i];
            }
        }
        return nums[0]+ans+max;
    }
}