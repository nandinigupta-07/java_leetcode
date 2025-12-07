class Solution {
    public int countOdds(int low, int high) {
        int odd=0;
         if(low%2!=0){
            odd++;
         }
         if(high%2!=0){
            odd++;
         }
         int ans=(high-low)+odd;
         return ans/2;
    }
}