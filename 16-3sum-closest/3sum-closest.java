class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
         int ans=nums[0]+nums[1]+nums[2];
         for(int i=0;i<nums.length;i++){
            if(i>0&& nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int num=nums[i]+nums[j]+nums[k];
                if (Math.abs(num - target) < Math.abs(ans - target)) {
                    ans = num;
                }
                if(num<target){
                    j++;
                }else if(num>target){
                    k--;
                }else{
                    return num;
                }
            }
         }
        return ans ;
    }
}
    