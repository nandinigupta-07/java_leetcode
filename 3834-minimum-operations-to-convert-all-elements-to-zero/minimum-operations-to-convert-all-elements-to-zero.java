class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();

        for (int x : nums) {
            if (x == 0) {
                // zero splits the array — layers cannot cross a zero
                st.clear();
                continue;
            }

            while (!st.isEmpty() && st.peek() > x) {
                st.pop();
            }
            if (st.isEmpty() || st.peek() < x) {
                ans++;
                st.push(x);
            }
        }
        return ans;
    }
}
