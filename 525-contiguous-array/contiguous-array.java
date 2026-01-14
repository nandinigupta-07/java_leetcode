class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
         
         int ans=0;
         int sum=0;
          for(int i=0;i<nums.length;i++){
             int cnt=0;
            if(nums[i]==0){
                sum-=1;
            }else{
                 sum+=nums[i];
            }
            if(sum==0){
                cnt+=(i+1);
                ans= Math.max(cnt,ans);
            }
            if(map.containsKey(sum)){
                cnt= i-map.get(sum);
               ans= Math.max(cnt,ans);
            }else{
                map.put(sum,i);
            }
             
          }
        return ans;
    }
}