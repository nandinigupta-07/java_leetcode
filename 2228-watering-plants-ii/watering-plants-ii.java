class Solution {
    public int minimumRefill(int[] nums, int a, int b) {
         int l=0;
         int aa=a;
         int bb=b;
         int r=nums.length-1;
         int count=0;
         while(l<r){
            if(nums[l]>aa){
                 count++;
                aa=a;
                 
                
            }
            aa=aa-nums[l];
            l++;
            
            if(nums[r]>bb){
                count++;
                bb=b;
                 
                 
            }
            bb=bb-nums[r];
            r--;
             
            if(l==r){
                if(Math.max(aa,bb)<nums[l])
                count++;
            } 
             
         }
         return count;
    }
}