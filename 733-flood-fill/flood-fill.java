
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int r, int c, int originalColor, int color) {

        // Check boundaries
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) {
            return;
        }

        // Stop if the pixel has a different color
        if (image[r][c] != originalColor) {
            return;
        }

        // Change the color
        image[r][c] = color;

        // Visit all four directions
        dfs(image, r + 1, c, originalColor, color); // Down
        dfs(image, r - 1, c, originalColor, color); // Up
        dfs(image, r, c + 1, originalColor, color); // Right
        dfs(image, r, c - 1, originalColor, color); // Left
    }
}
