class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[nums1.length];
         int i=0;
         int j=0;
         int u=0;
         while(i<m && j<n){
             if(nums1[i]< nums2[j]){
                ans[u]=nums1[i];
                i++;
                u++;
             }
             else{
                ans[u]=nums2[j];
                j++;
                u++;
             }
         }
         while(i<m){
            ans[u]=nums1[i];
            u++;
            i++;

         }
         while(j<n){
            ans[u]=nums2[j];
            u++;
            j++;
         }
         for(int h=0;h<ans.length;h++){
            nums1[h]=ans[h];
         }
         return;
    }
}