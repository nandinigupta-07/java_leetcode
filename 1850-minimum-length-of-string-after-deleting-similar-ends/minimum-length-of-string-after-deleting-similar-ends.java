class Solution {
    public int minimumLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j && sb.charAt(i)==sb.charAt(j)){
            char ch=sb.charAt(i);
            while(i<=j && sb.charAt(i)==ch){
                i++;
            }
            while(i<=j&& sb.charAt(j)==ch){
                j--;
            }
             
        }
        return j-i+1;
    }
} 