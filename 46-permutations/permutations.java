class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> uu=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        permutn(arr,ans,new ArrayList<>(),freq);
        return ans;
    }
    public void permutn(int arr[],List<List<Integer>> ans,List<Integer> uu,boolean freq[]){
        if(uu.size()==arr.length){
            ans.add(new ArrayList<>(uu));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq [i]=true;
                uu.add(arr[i]);
                permutn(arr,ans,uu,freq);
                uu.remove(uu.size()-1);
                freq[i]=false;
            }
        }
        
        
    }
}