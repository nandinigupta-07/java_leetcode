import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Long, long[]> occr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long key = nums[i];
            occr.putIfAbsent(key, new long[]{0, 0});
            occr.get(key)[0] += i;
            occr.get(key)[1] += 1;
        }

        Map<Long, long[]> occl = new HashMap<>();
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            long key = nums[i];

            occl.putIfAbsent(key, new long[]{0, 0});
            occl.get(key)[0] += i;
            occl.get(key)[1] += 1;

            occr.get(key)[0] -= i;
            occr.get(key)[1] -= 1;

            ans[i] += i * occl.get(key)[1] - occl.get(key)[0];
            ans[i] += occr.get(key)[0] - i * occr.get(key)[1];
        }

        return ans;
    }
}