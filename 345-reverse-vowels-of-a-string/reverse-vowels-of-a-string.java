class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            char left=sb.charAt(i);
            char right=sb.charAt(j);
            if(isVowel(left) && isVowel(right)){
                sb.setCharAt(i,right);
                sb.setCharAt(j,left);
                i++;
                j--;
            }
            else if(!isVowel(left)){
                i++;
            }
            else{
                j--;
            }
        }
            return sb.toString();
        
    }
        private boolean isVowel(char ch){
            return "aeiouAEIOU".indexOf(ch)!=-1; 
    }
}