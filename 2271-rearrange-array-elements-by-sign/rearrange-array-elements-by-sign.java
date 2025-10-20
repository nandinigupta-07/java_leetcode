class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left=0;
        int right=1;
        
         int ans[]=new int[nums.length];
         int n=nums.length;
         int u=0;
          for( int num:nums){
            if(num>0){
                ans[left]=num;
                left+=2;
            }
            else{
                ans[right]=num;
                right+=2;
            }
          }
         return ans;
    }
}