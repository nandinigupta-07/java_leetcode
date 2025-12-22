class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list,(a,b)-> Integer.compare(a[0],b[0]));
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)[0]==list.get(i+1)[0]){
                list.get(i)[1]=list.get(i)[1]+list.get(i+1)[1];
                list.remove(i + 1);
                i--;
            }
        }
        int res[][]=new int[list.size()][2];

        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}