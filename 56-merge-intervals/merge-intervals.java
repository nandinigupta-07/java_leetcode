class Solution {
    public int[][] merge(int[][] nums) {
         List<int[]> list=new ArrayList<>();
         Arrays.sort(nums,(a,b)-> a[0]-b[0]);
        int n=nums.length;
        int start1=nums[0][0];
        int end1=nums[0][1];
        for(int i=1;i<n;i++){
            int start2=nums[i][0];
            int end2=nums[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);

            }else{
                list.add (new int[]{start1,end1});
            start1=start2;
            end1=end2;
            }
             
        }
        list.add (new int[]{start1,end1});
        return list.toArray(new int[list.size()][]);
    }
}