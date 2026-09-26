class Solution {
      int[][] dp = new int[1001][1002];
      public int fun(int i , int j , int[][] pairs){
        if(i >= pairs.length){
            return 0;
        }

        if(dp[i][j+1]!=-1){
            return dp[i][j+1];
        }

        int a = fun(i+1,j,pairs);
        int b = 0;
         if (j == -1 || pairs[j][1] < pairs[i][0]) {
             b = 1 + fun(i + 1, i, pairs);
            }
            return dp[i][j + 1] = Math.max(a, b);

         }
    public int findLongestChain(int[][] pairs) {
         Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

          for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                dp[i][j] = -1;

            }
        }

       return fun(0, -1, pairs);
        
        
        
    }
}