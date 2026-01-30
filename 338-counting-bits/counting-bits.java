class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int idx=n;
         
         while(n>=0){
            int cnt=0;
            String yy=Integer.toBinaryString(n);
            for(int i=0;i<yy.length();i++){
                if(yy.charAt(i)=='1'){
                    cnt++;
                }
            }
            arr[idx]=cnt;
            idx--;
            n--;
         }
         return arr;
    }
}