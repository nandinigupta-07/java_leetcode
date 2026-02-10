class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans=new ArrayList<>();
          if(str.length==1){
            List<String> kk=new ArrayList<>();
            kk.add(str[0]);
             ans.add(new ArrayList<>(kk));
            return ans ;
          }
          String nums[]=new String[str.length];
         for(int i=0;i<str.length;i++){
            String ch=str[i];
                char array[]=ch.toCharArray();
                Arrays.sort(array);
                String sorted=new String(array);
                nums[i]=sorted;
         }
         HashMap<String,List<String>>map =new HashMap<>();
         for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(str[i]);
         }
          
         return new ArrayList<>(map.values());
    }
}