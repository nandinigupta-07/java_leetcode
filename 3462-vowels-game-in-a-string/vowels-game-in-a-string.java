class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".contains(String.valueOf(ch));
    }
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
}