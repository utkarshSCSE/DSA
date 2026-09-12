class Solution {
    int[][] dp = new int[501][501];
    int fun(int p, int i, int[] nums, int m, int k) {

        if (i >= nums.length)
            return 0;

        if (dp[i][p] != -1)
            return dp[i][p];

        int ans = 0;
        m = Math.max(m, nums[i]);
        int len = i - p + 1;
        if (len == k) {
            int c1 = (m * len) + fun(i + 1, i + 1, nums, 0, k);
            ans = Math.max(ans, c1);
        } else {
            int c1 = (m * len) + fun(i + 1, i + 1, nums, 0, k);
            int c2 = fun(p, i + 1, nums, m, k);
            ans = Math.max(ans, c1);
            ans = Math.max(ans, c2);
        }
        return dp[i][p] = ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {

        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < 501; j++) {
                dp[i][j] = -1;
            }
        }
        return fun(0, 0, arr, 0, k);
    }
}