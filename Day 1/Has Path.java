import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static int x=0;
    public static boolean solution(int src, int dest, ArrayList < Edge > [] graph, int vtces) {
        boolean visited[] = new boolean[vtces];
        boolean an = dfs(src, dest, visited, graph);
        if(x>0){
            return true;
        }
        return false;
    }

    public static boolean dfs(int src, int dest, boolean[] visited, ArrayList < Edge > [] graph) {
        visited[src] = true;
        boolean a=false;
        if (src == dest) {
            x++;
        }
        for (Edge neighbour: graph[src]) {
            if (!visited[neighbour.nbr]) {
                dfs(neighbour.nbr, dest, visited, graph);
            }
        }
        return a;
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList < Edge > [] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList < > ();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        boolean ans = solution(src, dest, graph, vtces);
        System.out.print(ans);
    }

}
