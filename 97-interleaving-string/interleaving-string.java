class Solution {
    int[][] dp = new int[101][101];
    public boolean fun(int i, int j, String s1, String s2, String s3) {
        if (i == s1.length() && j == s2.length()) {
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        boolean ans = false;
        if (i < s1.length() &&
            s1.charAt(i) == s3.charAt(i + j)) {
            ans = fun(i + 1, j, s1, s2, s3);
        }
        if (!ans &&
            j < s2.length() &&
            s2.charAt(j) == s3.charAt(i + j)) {
            ans = fun(i, j + 1, s1, s2, s3);
        }
        if (ans) {
            dp[i][j] = 1;
        } else {
            dp[i][j] = 0;
        }
        return ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                dp[i][j] = -1;
            }
        }
        return fun(0, 0, s1, s2, s3);
    }
}
