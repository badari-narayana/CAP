class Solution
{
    boolean ans=false;
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    
    {
        
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false)
                dfs(i,-1,visited,adj);
        }
        
        return ans;
    }
    public void dfs(int src,int parent,boolean visited[],ArrayList<ArrayList<Integer>> adj){
        visited[src]=true;
        for(Integer neighbour:adj.get(src)){
            
            if(visited[neighbour]==true && neighbour!=parent){
                ans=true;
            }
            if(visited[neighbour]==false){
                dfs(neighbour,src,visited,adj);
            }
        }
    }
}
