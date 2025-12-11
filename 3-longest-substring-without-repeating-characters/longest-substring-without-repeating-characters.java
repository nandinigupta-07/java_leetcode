class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        String str = "";
        int maxlen = 0;

        while (r < n) {
            char ch=s.charAt(r);
            if(!str.contains(String.valueOf(ch))){
                str=str+ch;
                 maxlen = Math.max(maxlen, str.length());
                r++;
            }
            else{
                str=str.substring(1);
                l++;
            }
        }

        return maxlen;
    }
}