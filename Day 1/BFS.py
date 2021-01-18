
class Solution:
    def bfsOfGraph(self, V, adj):
        ans=list()
        visited=[False]*V
        queue=list()
        queue.append(0)
        ans.append(0)
        while(len(queue)!=0):
            size=len(queue)
            
            for i in range(size):
                cur=queue.pop(0)
                for neighbour in adj[cur]:
                    if(visited[neighbour]==False):
                        visited[neighbour]=True
                        ans.append(neighbour)
                        queue.append(neighbour)
                
       
        return ans
