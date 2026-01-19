class Solution {
    public int maxDepth(String s) {
        Stack <Character> st=new Stack<>();
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(s.charAt(i)=='('){
                count++;
              ans=  Math.max(count,ans);
            }
            if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    st.pop();
                     
                }
                if(!st.isEmpty()){
                     st.pop();
                      count--;
                }
                
                
            }
        }
        return ans;
    }
}