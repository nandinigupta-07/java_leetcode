class Solution {
    public int[][] insert(int[][] nums, int[] news) {
        int arr[][]=new int[nums.length+1][];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i].clone();
        }
        arr[nums.length]=news.clone();
        List<int[]> list=new ArrayList<>();
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
         int start1=arr[0][0];
         int end1=arr[0][1];
         for(int i=1;i<arr.length;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }else{
                list.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
             
         }
         list.add(new int[]{start1, end1});
         return list.toArray(new int[list.size()][]);
    }
}