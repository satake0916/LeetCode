package java_lib;
import java.util.*;

class Dijkstra{
    public void dijkstra(List<List<Edge>> edge, int[] d, int start){
        PriorityQueue<Integer> q = new PriorityQueue<>();

        d[start] = 0;
        q.add(start);

        while(!q.isEmpty()){
            int cur = q.poll();
            for(Edge e: edge.get(cur)){
                int next = e.to;
                int next_weight = d[cur] + e.weight;
                if(next_weight < d[next]){
                    d[next] = next_weight;
                    q.add(next);
                }
            }
        }
    }
}

class Edge{
    int to, weight;
    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}