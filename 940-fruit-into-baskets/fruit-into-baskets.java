class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int len=0;
        int ans=-1;
        if(fruits.length<=2){
            return fruits.length;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()<=2){
                ans=Math.max(ans,r-l+1);
            }
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;

            }
            r++;
        }
        return ans;
    }
}