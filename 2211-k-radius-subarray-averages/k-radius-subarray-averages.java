class Solution {
    public int[] getAverages(int[] nums, int k) {
          int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        if(k==0) return nums;
        if(2*k + 1>nums.length)  {
            
            return arr ;
        } 
       
        long sum=0;
        int ws=2*k+1;
        for(int i=0;i<ws;i++){
            sum+=nums[i];
        }
        arr[k]=(int)(sum/ws);
        for(int i=ws;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-ws];
            arr[i-k]=(int)(sum/ws);
        }
        return arr;
    }
}