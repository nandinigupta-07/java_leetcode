class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
         int n=nums.length;
         int u=0;
         for(int num:nums){
            if(num<pivot){
                ans[u++]=num;
            }
         }
         for(int num:nums){
            if(num==pivot){
                ans[u++]=num;
            }
         }
         for(int num:nums){
            if(num>pivot){
                ans[u++]=num;
            }
         }
     return ans;
    }
}