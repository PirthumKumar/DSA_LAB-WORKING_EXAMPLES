import  java.util.*;
class Edge{
    int src;
    int dest;
    Edge(int src , int dest){
        this.src = src;
        this.dest=  dest;
    }
}
public class Graph_bfs {
    
     public void CreateGraph(ArrayList graph[] , int v){
  Scanner ask = new Scanner(System.in);
for(int i=0;i<v;i++){
    graph[i] = new ArrayList<>();
}
System.out.println("Enter The number of Edges :");
int edges = ask.nextInt();
for(int i=0;i<edges;i++){
    System.out.println("Enter Src and Dest : "  );
    int src = ask.nextInt();
    int dest = ask.nextInt();
    graph[src].add(new Edge(src , dest));
}
    }
    public  void Bfs(ArrayList graph[], int v){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
            int node = q.remove();
            if(visited[node] == false){
                System.out.print(node +" ");
                visited[node] = true;
                for(int i=0;i<graph[node].size();i++){
                    Edge e = (Edge) graph[node].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph_bfs d = new Graph_bfs();
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the number of vertices : ");
int v = ask.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[v];
d.CreateGraph(graph , v);
System.out.println("BFS of graph is : ");
d.Bfs(graph, v);
    }
}
