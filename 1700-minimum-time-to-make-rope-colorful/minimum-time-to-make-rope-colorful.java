class Solution {
    public int minCost(String colors, int[] arr) {
        int cnt=0;
        int prev=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(prev)){
                cnt+=Math.min(arr[i],arr[prev]);
                if(arr[i]>arr[prev]) prev=i;
            }else{
                prev=i;
            }
        }
        return cnt;
    }
}