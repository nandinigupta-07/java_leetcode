class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
         }
         for( var oper:operations){
            nums[map.get(oper[0])]=oper[1];
            map.put(oper[1],map.get(oper[0]));
         }
         return nums;
    }
}