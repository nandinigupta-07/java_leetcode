class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character,Integer> map=new HashMap<>();
          int i=0;
          int j=0;
          int len=0;
          String str="";
          while(i<s.length()){
            if(!str.contains(String.valueOf(s.charAt(i)))){
                str=str+s.charAt(i);
                len=Math.max(len,i-j+1);
                i++;
            }else{
                str=str.substring(1);
                j++;
            }
          }
          return len;
                    
    }
}