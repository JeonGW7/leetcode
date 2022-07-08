class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                ans=Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid,int i,int j){
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        grid[i][j]=0;
        int ans=0;
        for(int d=0;d<4;d++){
            int ni=i+dir[d][0];
            int nj=j+dir[d][1];
            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]==1){
               ans+=dfs(grid,ni,nj); 
            }
        }
        return ans+1;
    }
    
}