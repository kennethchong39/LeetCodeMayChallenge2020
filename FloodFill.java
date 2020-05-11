public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if(image.length == 0) {
        return image;
    }
    int color = image[sr][sc];
    if(color != newColor) dfs(image, sr, sc, color, newColor);
    return image;
}

public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
    if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
        return;
    }

    image[sr][sc] = newColor;
    dfs(image, sr-1, sc, color, newColor);
    dfs(image, sr+1, sc, color, newColor);
    dfs(image, sr, sc+1, color, newColor);
    dfs(image, sr, sc-1, color, newColor);
}

/*
 * First check if image.length is not less than 0; if so return image. 
 * Obtain the color from image[sr][sc];
 * if not equals to newColor --> dfs with the image, sr, sc, color , and new color;
 * 
 * In dfs method:
 * Check corner case: 1. sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color --> return;
 * image[sr][sc] = newColor;
 * dfs(image, sr+1, sc, color, newColor);
 * dfs(image, sr-1, sc, color, newColor);
 * dfs(image, sr, sc+1, color, newColor);
 * dfs(image, sr, sc-1, color, newColor);
 * Time complexity: O(n);
 * Space Complexity: O(n); because we using stack to recursively call 
 */
