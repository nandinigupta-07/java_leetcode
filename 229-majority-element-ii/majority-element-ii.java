class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
         HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>n/3){
                set.add(nums[i]);
            }
        }
        List<Integer> list=new ArrayList<>(set);
        return list;
    }
}