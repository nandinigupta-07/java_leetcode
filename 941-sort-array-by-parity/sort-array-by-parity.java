class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int arr[]=new int[nums.length];
        // int i=0;
         int u=0;
        //  while(i<nums.length){
        //     if(nums[i]%2==0){
        //         arr[u]=nums[i];
        //         i++;
        //         u++;
        //     }
        //  }
        //  i=0;
        //   while(i<nums.length){
        //     if(nums[i]%2!=0){
        //         arr[u]=nums[i];
        //         i++;
        //         u++;
        //     }
        //   }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[u]=nums[i];
                u++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[u]=nums[i];
                u++;
            }
        }
          return arr;
    }
}