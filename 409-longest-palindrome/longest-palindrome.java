class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int sum=0;
        boolean hasOdd=false;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            int value=e.getValue();
            if(value%2==0  ){
                sum+=value;  
            }
            else  {
                sum+=value-1;
                hasOdd=true; 
            }  
        }
        if(hasOdd) sum++;
        return sum;
    }
}