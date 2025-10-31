class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]={-1,-1};
        Arrays.sort(nums);
        int u=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1] && u>=0){
                arr[u]=nums[i];
                u--;
            }
        }
        return arr;
    }
}