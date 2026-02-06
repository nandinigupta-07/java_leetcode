import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : nums){
            list.add(x);
        }
         
        int cnt=0;
        int sum=0;
        while(true){
            boolean sorted=true;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    sorted=false;
                    break;
                }
            }
            if(sorted) break;
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<list.size()-1;i++){
                  sum=list.get(i)+list.get(i+1);
                  if(min>sum){
                    min=sum;
                    idx=i;
                  }
            }
            if(idx==-1) break;
            list.remove(idx);
            list.remove(idx);
            list.add(idx,min);
            cnt++;
        }
        return cnt;
         
    }
}
