class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];

        for (int[] index : indices) {

            int r = index[0];
            int c = index[1];

            // Increment complete row
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }

            // Increment complete column
            for (int i = 0; i < m; i++) {
                matrix[i][c]++;
            }
        }

        int count = 0;

        // Count odd values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}