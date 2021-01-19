// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution
{
    boolean ans=false;
    public boolean is_Possible(int[][] grid)
    {
        int sr=0;
        int sc=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    sr=i;
                    sc=j;
                }
            }
        }
        dfs(sr,sc,grid);
        return ans;
    }
    
    public void dfs(int sr,int sc,int[][] grid){
        int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int dir[]:dirs){
            int row=sr+dir[0];
            int col=sc+dir[1];
            if(!(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1)){
                if(grid[row][col]==2){
                    ans=true;
                }
                if(grid[row][col]==3){
                    grid[row][col]=1;
                    dfs(row,col,grid);
                }
            }
        }
    }
    
}
