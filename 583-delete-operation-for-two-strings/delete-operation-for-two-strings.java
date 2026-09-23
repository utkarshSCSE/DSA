class Solution {
    int[][] dp = new int[501][501];
    public int fun(int i, int j, String word1, String word2) {
        if (i >= word1.length() || j >= word2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int m = 0;
        if (word1.charAt(i) == word2.charAt(j)) {
            int a = 1 + fun(i + 1, j + 1, word1, word2);
            m = Math.max(m, a);
             } else {
            int a = fun(i + 1, j, word1, word2);
            int b = fun(i, j + 1, word1, word2);
            m = Math.max(m, a);
            m = Math.max(m, b);
        }
        return dp[i][j] = m;
    }
     public int minDistance(String word1, String word2) {
        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < 501; j++) {
                dp[i][j] = -1;
            }
        }
        int lcs = fun(0, 0, word1, word2);
        return word1.length() + word2.length() - 2 * lcs;
    }
}
