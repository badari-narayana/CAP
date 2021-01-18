
class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        dfs(0,adj,ans,visited);
        return ans;
    }
    public static void dfs(int source,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans,boolean visited[]){
        visited[source]=true;
        ans.add(source);
        for(Integer neighbour:adj.get(source)){
            if(!visited[neighbour])
                dfs(neighbour,adj,ans,visited);
        }
    }
}
