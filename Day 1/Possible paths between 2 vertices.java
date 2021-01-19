class Solution
{
    int count=0;
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination)
    {
        dfs(source,destination,adj);
        return count;
        
    }
    public void dfs(int src,int dist,ArrayList<ArrayList<Integer>> adj){
        if(src==dist){
            count++;
        }
        for(Integer neighbour:adj.get(src)){
            dfs(neighbour,dist,adj);
        }
    }
}
