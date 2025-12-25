class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[]=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&& j<n){
            if(nums1[i]<nums2[j]){
                res[k]=nums1[i];
                i++;
                k++;
            }else{
                res[k]=nums2[j];
                j++;
                k++;
            }
            
        }
        while(i<m){
            res[k]=nums1[i];
            k++;
            i++;
             
        }
        while(j<n){
            res[k]=nums2[j];
            k++;
            j++;
             
        }
        for(int u=0;u<m+n;u++){
            nums1[u]=res[u];
        }
        return;
    }
}