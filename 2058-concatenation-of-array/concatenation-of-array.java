class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        int u=0;
        for(int i=0;i<nums.length;i++){
            arr[u]=nums[i];
            u++;
        }
        for(int i=0;i<nums.length;i++){
            arr[u]=nums[i];
            u++;
        }
        return arr;
    }
}