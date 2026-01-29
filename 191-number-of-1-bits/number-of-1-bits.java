class Solution {
    public int hammingWeight(int n) {
        int uu=n;
        int cnt=0;
        String ans=Integer.toBinaryString(uu);
        for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)=='1'){
                    cnt++;
                }
        }
        return cnt;
    }
}