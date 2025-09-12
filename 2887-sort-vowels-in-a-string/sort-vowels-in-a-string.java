class Solution {
    public  static boolean isVowel(char ch){
        return "aeiouAEIOU".contains(String.valueOf(ch));
    }
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder t = new StringBuilder();
        int o=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                t.append(list.get(o));
                o++;
            }
            else{
                 t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
}