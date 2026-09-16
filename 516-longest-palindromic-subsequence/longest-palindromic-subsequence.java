class Solution {
        int[][] dp = new int[1006][1007];
    public int fun(int i, int j, String s, String t) {

        if (i >= s.length() || j >= t.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int m = 0;
        if (s.charAt(i) == t.charAt(j)) {

            int a = 1 + fun(i + 1, j + 1, s, t);
            m = Math.max(m, a);
             } else {

            int a = fun(i + 1, j, s, t);
            int b = fun(i, j + 1, s, t);

            m = Math.max(m, a);
            m = Math.max(m, b);
        }

        return dp[i][j] = m;
    }

    public int longestPalindromeSubseq(String s) {

        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }

        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                dp[i][j] = -1;
            }
        }

        return fun(0, 0, s, t);
    }
}



        
    
