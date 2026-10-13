class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] previousRow = matrix[0].clone();

        for (int i = 1; i < n; i++) {
            int[] currentRowDp = new int[n];

            for (int col = 0; col < n; col++) {
                int min = previousRow[col];

                if (col > 0) {
                    min = Math.min(min, previousRow[col - 1]);
                }

                if (col + 1 < n) {
                    min = Math.min(min, previousRow[col + 1]);
                }

                currentRowDp[col] = matrix[i][col] + min;
            }

            previousRow = currentRowDp;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, previousRow[i]);
        }

        return ans;
    }
}