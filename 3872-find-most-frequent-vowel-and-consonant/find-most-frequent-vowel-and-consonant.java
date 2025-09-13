class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".contains(String.valueOf(ch));
    }
    public int maxFreqSum(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int cons=0;
        int vow=0;
        for(char ch:mp.keySet()){
            int freq=mp.get(ch);
            if(isVowel(ch)){
              vow=  Math.max(vow,freq);
            }
            else{
                cons=Math.max(cons,freq);
            }
        }
        return vow+cons;
    }
}