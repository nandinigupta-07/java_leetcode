class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> ans=new ArrayList<>();
         
        for(int i=1;i<arr.length;i++){
            int yy=arr[i]-arr[i-1];
             min=Math.min(min,yy);
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> list=new ArrayList<>();
            if(arr[i]-arr[i-1]==min){
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
            if(!list.isEmpty()){
                ans.add(new ArrayList <>(list));
            }
             
        }
        return ans;
    }
}