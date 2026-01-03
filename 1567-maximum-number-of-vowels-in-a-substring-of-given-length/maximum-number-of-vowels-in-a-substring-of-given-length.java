class Solution {
    public int maxVowels(String s, int k) {
         int count=0;
         int ans=0;
         String vowel="aeiouAEIOU";
         for(int i=0;i<k;i++){
            if(vowel.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
         }
          ans = count;
         for(int i=k;i<s.length();i++){
            if(vowel.contains(String.valueOf(s.charAt(i-k)))){
                count--;
            }
              
              if(vowel.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
            ans=Math.max(ans,count);
         }
         return ans;
    }
}