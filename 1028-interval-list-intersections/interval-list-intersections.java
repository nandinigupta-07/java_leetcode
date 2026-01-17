class Solution {
    public int[][] intervalIntersection(int[][] list1, int[][] list2) {
        List<int[]> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<list1.length && j<list2.length){
            int start1=list1[i][0];
            int end1=list1[i][1];
            int start2=list2[j][0];
            int end2=list2[j][1];
            int start=Math.max(start1,start2);
            int end=Math.min(end1,end2);
            if(start<=end){
                list.add(new int[]{start,end});
            } 
            if(end1<end2){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}