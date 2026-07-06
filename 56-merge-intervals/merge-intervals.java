class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        int ans[]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int uu[]=intervals[i];
            if(ans[1]>=uu[0]){
                ans[1]=Math.max(ans[1],uu[1]);
            }else{
                list.add(ans);
                ans=uu;
            }
        }
        list.add(ans);
        return list.toArray(new int[list.size()][]);
    }
}