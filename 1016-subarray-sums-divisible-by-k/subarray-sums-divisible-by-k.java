class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int yy=(sum%k +k)%k;
            if(map.containsKey(yy)){
                cnt+=map.get(yy);
            }
            map.put(yy,map.getOrDefault(yy,0)+1);
        }
        return cnt;
    }
}