class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int colour=image[sr][sc];
        boolean visited[][]=new boolean[image.length][image[0].length];
        image[sr][sc]=newColor;
        visited[sr][sc]=true;
        dfs(sr,sc,image,newColor,colour,visited);
        return image;
        
    }
    public void dfs(int r, int c , int[][] image,int newcolor,int color,boolean visited[][]){
        int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int dir[]:dirs){
            int row=r+dir[0];
            int col=c+dir[1];
            if(!(row<0 || row>image.length-1 || col<0 || col>image[0].length-1) && visited[row][col]==false && image[row][col]==color){
                image[row][col]=newcolor;
                visited[row][col]=true;
                dfs(row,col,image,newcolor,color,visited);
            }
        }
    }
    
}
