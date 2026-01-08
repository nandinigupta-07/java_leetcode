class Solution {
    public int distinctAverages(int[] nums) {
        float sum=0;
        HashSet<Float> set=new HashSet<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            sum=(nums[i]+nums[j])/2.0f;
            set.add(sum);
            i++;
            j--;
        }
        return set.size();
    }
}