class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
        Arrays.sort(capacity);
        int cnt=0;
        int ans=0;
        for(int i=capacity.length-1;i>=0;i--){

             ans =ans+capacity[i];
            if(ans>=sum){
                return cnt+1;
            }
            else{
                cnt++;
            }
        }
        return -1;
    }
}