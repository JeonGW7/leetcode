class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color)
            return image;

        int prev_color = image[sr][sc];
       
        
        dfs(image, sr, sc, prev_color, color);
        return image;
        
    }

    void dfs(int[][] image, int i, int j, int color, int new_color){
        if(i < image.length && i >= 0 && j <image[0].length && j>= 0 && image[i][j] == color){
            image[i][j] = new_color;
            dfs(image, i+1, j, color, new_color);
            dfs(image, i-1, j, color, new_color);
            dfs(image, i, j+1, color, new_color);
            dfs(image, i, j-1, color, new_color);
        }
    }
}