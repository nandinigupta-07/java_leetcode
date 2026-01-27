class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int arr[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        
        for(int i=1;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int idx=st.pop();
                arr[idx]=i-idx;
                 
            }
            st.push(i);
        }
        return arr;
    }
}