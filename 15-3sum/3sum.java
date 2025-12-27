class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        Set<List<Integer>> ans=new HashSet<>();
         
         for(int i=0;i<nums.length;i++){
              
             if(i > 0 && nums[i] == nums[i-1]) continue;
             HashSet<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                  
                 int k =-(nums[i]+nums[j]);
                if(set.contains(k)){
                   ans.add(Arrays.asList(nums[i], k, nums[j]));
                     
                }else{
                    set.add(nums[j]);
                     
                }
            }
         }
        return  new ArrayList<>(ans);

    }
}