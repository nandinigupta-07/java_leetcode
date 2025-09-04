class Solution {
    public int findClosest(int x, int y, int z) {
        
        int close=x-z;
        int ans=y-z;
        close= Math.abs(close);
        ans= Math.abs(ans);
        if(close==ans){
            return 0;
        }     
        else if(close<ans){
            return 1;
        }
           else{
               return 2;
           }
    }
}