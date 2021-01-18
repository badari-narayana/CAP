class Solution:
    def dfs(self,source,adj,ans,visited):
        visited[source]=True
        ans.append(source)
        for neighbour in adj[source]:
            if(visited[neighbour]==False):
                Solution().dfs(neighbour,adj,ans,visited)
    def dfsOfGraph(self, V, adj):
        visited=[False]*V
        ans=list()
        Solution().dfs(0,adj,ans,visited)
        return ans
