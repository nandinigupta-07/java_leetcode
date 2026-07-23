class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(i,j,vis,grid);
                    cnt++;
                }
            }
        }

        return cnt;
    }
    void  dfs(int row,int col,int vis[][],char grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        vis[row][col]=1;
        if((row+1)<n && grid[row+1][col]=='1' && vis[row+1][col]==0) dfs(row+1,col,vis,grid);
        if((row-1)>=0 && grid[row-1][col]=='1' && vis[row-1][col]==0) dfs(row-1,col,vis,grid);
        if((col+1)<m && grid[row][col+1]=='1' && vis[row][col+1]==0 ) dfs(row,col+1,vis,grid);
        if((col-1)>=0 && grid[row][col-1]=='1' && vis[row][col-1]==0) dfs(row,col-1,vis,grid);
    }
}