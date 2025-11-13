class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int sum=1;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }else{
                sum*=nums[i];
            }  
         }
         Arrays.fill(arr,0);
         int zero=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                zero++;
             }
         }
         if(zero>=2){
            return arr;
         }
          
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[i]=sum;
                return arr;
            }
         }
         for(int i=0;i<nums.length;i++){
            arr[i]=sum/nums[i];
         }
        return arr;
    }
}
