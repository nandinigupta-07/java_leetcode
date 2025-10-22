class Solution {
    public int countBinarySubstrings(String s) {
        int i=0;
        int count=0;
        int prevgroup=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            int currgroup = 0;
            while(i<s.length() && s.charAt(i)==ch){
                i++;
                currgroup++;
            }
             
            count+=Math.min(prevgroup, currgroup);
            prevgroup = currgroup;
        }
        return count;
    }
}