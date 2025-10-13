class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        for(String word:words){
            if(result.isEmpty()){
                result.add(word);
            }else{
                String last =result.get(result.size()-1);
                if(isAnagram(last,word)){
                    continue;
                }else{
                    result.add(word);
                }
            }
        }
        return result;
    }
    public boolean isAnagram(String a, String b){
        if(a.length()!=b.length()) return false;
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}