 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        double ans=0;
        int h=0;
        for(int i=0;i<nums1.length;i++){
            arr[h]=nums1[i];
            h++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[h]=nums2[i];
            h++;
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int mid=arr[arr.length/2];
            int midi=arr[arr.length/2-1];
            ans= ((double)mid+(double)midi) /2.0;
        }
        else{
            ans=(double)arr[arr.length/2];
        }
        return (double)ans;
    }
}