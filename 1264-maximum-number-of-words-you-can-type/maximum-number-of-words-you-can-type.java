class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       String words[]=text.split(" ");
       int cnt=0;
        
       for(String word:words){
            boolean broken=true;
       
       for(char c:brokenLetters.toCharArray()){
            if(word.indexOf(c)!=-1){
                broken=false;
                break;
            }
            
       }
       if(broken){
        cnt++;
       }
       }
       return cnt;
    }
}