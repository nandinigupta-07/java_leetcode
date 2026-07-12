class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
         for(int num:set){
            map.put(num,rank);
            rank++;
         }
         int ans[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
         }
         return ans;
    }
}