import java.util.HashMap;
import java.util.Map;

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;

        // counts of values to the right of current j (initially all elements)
        Map<Long, Integer> right = new HashMap<>();
        for (int v : nums) right.put((long) v, right.getOrDefault((long) v, 0) + 1);

        Map<Long, Integer> left = new HashMap<>(); // counts to the left of j
        long ans = 0L;

        for (int j = 0; j < n; j++) {
            long val = nums[j];

            // remove current j from right (we're treating j as middle)
            right.put(val, right.get(val) - 1);
            if (right.get(val) == 0) right.remove(val);

            long need = val * 2L; // value required at i and k

            long leftCount = left.getOrDefault(need, 0);
            long rightCount = right.getOrDefault(need, 0);

            ans = (ans + (leftCount * rightCount) % MOD) % MOD;

            // add current to left for future iterations
            left.put(val, left.getOrDefault(val, 0) + 1);
        }

        return (int) ans;
    }
}
