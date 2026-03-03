class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
         
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
             int paper=n-i;
            if(arr[i]>=paper){
                 return paper;
                 
            }
             
        }
        return 0;
    }
}