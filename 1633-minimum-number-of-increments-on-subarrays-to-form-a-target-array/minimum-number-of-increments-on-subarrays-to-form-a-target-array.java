class Solution {
    public int minNumberOperations(int[] target) {
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<target.length;i++){
            if(target[i]>max){
                max=target[i];
                idx=i;
            }
        }
         int ans=max;
         for(int i=idx;i<target.length-1;i++){
            if(target[i]<target[i+1]){
                ans+=target[i+1]-target[i];
            }
         }
         for(int i=idx;i>0;i--){
            if(target[i]<target[i-1]){
                ans+=target[i-1]-target[i];
            }
         }
         return ans;
    }
}