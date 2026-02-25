import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });

        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{Integer.bitCount(arr[i]), arr[i]});
        }

        int[] ans = new int[arr.length];
        int index = 0;
        while (!pq.isEmpty()) {
            int val = pq.peek()[1];
            pq.poll();
            ans[index++] = val;
        }

        return ans;
    }
}