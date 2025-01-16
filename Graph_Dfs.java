import java.util.ArrayList;
import java.util.Scanner;

class Edge{
    int src;
    int dest;
    Edge(int src , int dest){
        this.src = src;
        this.dest=  dest;
    }
}
public class Graph_Dfs {
    static  public void CreateGraph(ArrayList graph[] ,  int v){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        Scanner ask =  new Scanner(System.in);
        System.out.println("Enter the number of edges : ");
        int edge = ask.nextInt();
        for(int i=0;i<edge;i++){
            System.out.println("Enter the source and destination of edge : ");
            int src =ask.nextInt();
            int dest = ask.nextInt();
            graph[src].add(new Edge(src , dest));
        }       
      
    }

   static public void Dfs(ArrayList graph[] , int curr , boolean[] visited){
        System.out.print(curr+" " );
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = (Edge) graph[curr].get(i);
            if(visited[e.dest]==false){
                Dfs(graph, e.dest, visited);
            }
        }
        
    }
    public static void main(String[] args) {
        Graph_Dfs G = new Graph_Dfs();
      System.out.println("Enter the number of vertices : ");
      Scanner ask = new Scanner(System.in);
      int v = ask.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean visited[] = new boolean[v];
CreateGraph(graph , v);
Dfs(graph, 0, visited);
    }
}
