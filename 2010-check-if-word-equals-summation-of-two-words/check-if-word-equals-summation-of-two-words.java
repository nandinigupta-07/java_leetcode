class Solution {
    public int convert(String word){
        int num=0;
        for(int i=0;i<word.length();i++){
            num=num*10+(word.charAt(i)-'a');
        }
        return num;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
         int a=  convert(firstWord);
         int b=  convert(secondWord);
         int c=  convert(targetWord);
         return a+b==c;
    }
}