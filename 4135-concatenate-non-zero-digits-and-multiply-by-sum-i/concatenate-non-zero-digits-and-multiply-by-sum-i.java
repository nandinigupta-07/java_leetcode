class Solution {
    public long sumAndMultiply(int n) {
        String str=Integer.toString(n);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                ans+=str.charAt(i);
            }
        }
          if (ans.length() == 0) {
    return 0;
}
        int su=0;
        for(int i=0;i<ans.length();i++){
            su+=ans.charAt(i)-'0';
        }
        
        long num=Long.parseLong(ans);
       
         return  num*su;

    }
}