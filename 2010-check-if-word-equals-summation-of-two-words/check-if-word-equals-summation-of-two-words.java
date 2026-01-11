class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
          String first="";
         for(int i=0;i<firstWord.length();i++){
            char ch=firstWord.charAt(i);
             first+=ch-'a';
         }
         String sec="";
         for(int i=0;i<secondWord.length();i++){
            char ch=secondWord.charAt(i);
             sec+=ch-'a';
         }
         String finaal="";
         for(int i=0;i<targetWord.length();i++){
            char ch=targetWord.charAt(i);
             finaal+=ch-'a';
         }
         int a=Integer.parseInt(first);
         int b=Integer.parseInt(sec);
         int c=Integer.parseInt(finaal);
         if(a+b==c){
            return true;
         }
         return false;
    }
}