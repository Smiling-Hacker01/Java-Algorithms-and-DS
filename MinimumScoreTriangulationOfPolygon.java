public class MinimumScoreTriangulationOfPolygon {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        for (int length = 2; length < n; length++) {
            for (int i = 0; i + length < n; i++) {
                int j = i + length;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + values[i] * values[j] * values[k]);
                }
            }
        }

        return dp[0][n - 1];
    }
    public static void main(String[] args) {
        MinimumScoreTriangulationOfPolygon solution = new MinimumScoreTriangulationOfPolygon();
        int[] values = {1, 2, 3};
        System.out.println(solution.minScoreTriangulation(values)); // Output: 6
    }
}