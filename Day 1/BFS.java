
class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        LinkedList<Integer> queue=new LinkedList<>();
        boolean visited[]=new boolean[V];
        queue.add(0);
        ans.add(0);
        visited[0]=true;
        while(!(queue.size()==0)){
            
            int size=queue.size();
            for(int i=0;i<size;i++){
                int cur=queue.removeFirst();
                for(Integer neighbour:adj.get(cur)){
                    if(!visited[neighbour]){
                        ans.add(neighbour);
                        queue.add(neighbour);
                        visited[neighbour]=true;
                    }
                }
            }
        }
        return ans;
    }
}
