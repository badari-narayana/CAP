class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes=0;
        ArrayList<String> rotten=new ArrayList<String>();
        ArrayList<String> fresh=new ArrayList<String>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    rotten.add(""+i+j);
                }
                else if(grid[i][j]==1){
                    fresh.add(""+i+j);
                } 
            }
        }
        while(rotten.size()!=0&&fresh.size()!=0){
            int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
            int size=rotten.size();
           
            for(int i=0;i<size;i++){
                int row=(rotten.get(0).charAt(0)-'0');
                int col=(rotten.get(0).charAt(1)-'0');
                
                rotten.remove(0);
              
                for(int[] dir:dirs){
                   
                    int r=row+dir[0];
                    int c=col+dir[1];
                    
                   
                    if(!(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1) && grid[r][c]==1){
                        grid[r][c]=2;
                        rotten.add(""+r+c);
                        fresh.remove(""+r+c);
                    
                    }
                    
                }
            }
            minutes++;
            
        }
        if(fresh.size()==0)
            return minutes;
        return -1;
    }
}
