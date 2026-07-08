class Solution {
     static  void find_next(int height[],int nse[]){
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && height[i]<=height[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                nse[i]=st.peek();
            }else{
                nse[i]=n;
                 
            }
            st.push(i);
        }
    }
     static void find_prev(int height[],int pse[]){
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[i]<=height[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[i]=st.peek();
            }else{
                pse[i]=-1;
                
            }
             st.push(i);
        }
    }
    public int largestRectangleArea(int[] height) {
         int n=height.length;
         int pse[]=new int[n];
         int nse[]=new int[n];
         find_next(height,nse);
         find_prev(height,pse);
         int ans=0;
        for(int i=0;i<n;i++){
        int width = nse[i]-pse[i]-1;
        int area = width*height[i];
        ans = Math.max(ans, area);
    }
        return ans;
    }
}