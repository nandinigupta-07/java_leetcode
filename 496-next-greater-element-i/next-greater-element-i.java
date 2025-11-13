class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
         
        for(int i=0;i<nums1.length;i++){
            int max=-1;
             for(int j=0;j<nums2.length;j++){
                int idx=j;
                if(nums1[i]==nums2[j]){
                     while(idx!=nums2.length){
                        if(nums2[idx]>nums1[i]){
                            max=nums2[idx];
                            break;
                        }
                         idx++;
                     }
                }
                
             }
             arr[i]=max;
              
        }
         
        return arr;
    }
}