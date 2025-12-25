class Solution {
    public int reverse(int x) {
          long v=x;
          if(x<0){
            x=x*-1;
          }
          long rev=0;
          while(x>0){
            int rem=x%10;
             rev=rev*10+rem;
             x=x/10;
          }
          if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) {
            return 0;
          }
          if(v<0){
            rev=(int)rev*-1;
          }
          return  (int)rev;
    }
}