class Solution {
    public int nextBeautifulNumber(int n) {
        n=n+1;
        while(true){
            String str=Integer.toString(n);
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            boolean balanced=true;
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                int digit=entry.getKey()-'0';
                int freq=entry.getValue();
                if(digit!=freq){
                     balanced=false;
                     break;
                }
            }
            if(balanced){
                return n;
            }
            n++;
        }
        

    }
}