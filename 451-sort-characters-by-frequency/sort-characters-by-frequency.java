class Solution {
    public String frequencySort(String s) {
         StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
         List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue() - a.getValue());
         for(Map.Entry<Character,Integer> e:list){
            char ch=e.getKey();
            int value=e.getValue();
            for(int i=0;i<value;i++){
                sb.append(ch);
            }
         }
         return sb.toString();
    }
}