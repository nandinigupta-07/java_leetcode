import java.util.*;
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int lastUsed = Integer.MIN_VALUE;  
        for (int num : nums) {        
            int target = Math.max(num - k, lastUsed + 1);
            if (target <= num + k) {
                count++;
                lastUsed = target;
            }
        }
        return count;
    }
}
