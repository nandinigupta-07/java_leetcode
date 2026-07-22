class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[cnt]=nums[i];
                cnt++;
            }
             
        }
        return cnt;
    }
}