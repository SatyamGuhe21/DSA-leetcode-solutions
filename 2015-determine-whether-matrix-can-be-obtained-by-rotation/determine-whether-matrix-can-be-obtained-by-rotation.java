class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        // Try 0°, 90°, 180°, and 270°
        for (int rotation = 0; rotation < 4; rotation++) {

            // Check whether mat == target
            boolean same = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {

                    if (mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }

                if (!same) {
                    break;
                }
            }

            if (same) {
                return true;
            }

            // Rotate mat 90° clockwise

            // Step 1: Transpose
            for (int i = 0; i < mat.length; i++) {
                for (int j = i; j < mat.length; j++) {

                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // Step 2: Reverse every row
            for (int i = 0; i < mat.length; i++) {

                int left = 0;
                int right = mat.length - 1;

                while (left < right) {

                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;

                    left++;
                    right--;
                }
            }
        }

        return false;
    }
}