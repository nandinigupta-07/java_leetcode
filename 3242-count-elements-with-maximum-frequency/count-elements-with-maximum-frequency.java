class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=Collections.max(map.values());
        int sum=0;
      
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxfreq ){
                sum+=entry.getValue();
            }
        }
        return sum;
    }
}