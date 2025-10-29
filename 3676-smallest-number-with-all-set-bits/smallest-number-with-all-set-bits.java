class Solution {
    public int smallestNumber(int n) {
        for(int i=0;i<n;i++){
            int ans=(int)Math.pow(2,i);
            if(ans>n){
                return ans-1;
            }
        }
        return 1;
    }
}