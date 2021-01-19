class Solution {
    public int numIslands(char[][] grid) {
        int lands=0;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    lands++;
                }
            }
            
        }
        return lands;
    }
    public static void dfs(int row,int col,char[][] grid){
        grid[row][col]=0;
        int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int x[]:dirs){
            int i=row+x[0];
            int j=col+x[1];
            if(!(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1) && grid[i][j]=='1'){
                dfs(i,j,grid);
            }
        }
        
    }
}
