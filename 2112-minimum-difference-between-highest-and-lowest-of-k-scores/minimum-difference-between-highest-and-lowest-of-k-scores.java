class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length==1 && k==1) return 0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        
        for(int i=0;i<nums.length-k+1;i++){
             ans=nums[i+k-1]-nums[i];
             min=Math.min(ans,min);
        }
        return min;    
    }
}