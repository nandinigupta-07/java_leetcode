class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
         int sum=0;
        sum=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            int y=0;
            y=arr[i]-arr[i-1];
            if(y!=sum){
                return false;
            }
              
        }
        return true;
    }
}