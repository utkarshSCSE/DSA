class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        int maxLength = 0;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) == ')') {
                if (s.charAt(i - 2) == '(') {
                    dp[i] = dp[i - 2] + 2;
                } else {
                    int matchIndex = i - dp[i - 1] - 1;

                    if (matchIndex > 0 && s.charAt(matchIndex - 1) == '(') {
                        dp[i] = dp[i - 1] + 2 + dp[matchIndex - 1];
                    }
                }

                maxLength = Math.max(maxLength, dp[i]);
            }
        }

        return maxLength;
    }
}