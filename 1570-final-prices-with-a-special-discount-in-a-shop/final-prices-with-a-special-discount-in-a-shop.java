class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();   // default: no discount
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] >= prices[i]) {
                ans[st.peek()] -= prices[i];
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
