class Solution {
    public void rotate(int[] nums, int k) {
        int ans[]=new int[nums.length];
        int u=0;
        int n=nums.length;
        k=k%n;
        for(int i=n-k;i<n;i++){
            ans[u]=nums[i];
            u++;
        }
        for(int i=0;i<n-k;i++){
            ans[u]=nums[i];
            u++;
        }
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i];
        }
        return;
    }
}