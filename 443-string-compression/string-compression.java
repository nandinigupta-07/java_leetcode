class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length){
            char curr=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==curr){
                i++;
                cnt++;
            }
            chars[idx++]=curr;
            if(cnt>1){
                for(char c:String.valueOf(cnt).toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}