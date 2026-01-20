class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] =new int[nums.size()];
        int ans=-1;
        for(int i=0;i<nums.size();i++){
             int n=nums.get(i);
             if((n&1)==1){
                arr[i]=n & ~(((n+1) & ~n)>>1);
             }else{
                arr[i]=-1;
             }
             
        }
        return arr;
    }
}