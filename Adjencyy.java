import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Adjencyy {
    static int V = 4;
    @SuppressWarnings("unchecked")
    static ArrayList<Edge> graph[] = new ArrayList[V];

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public void bfs(int u) {
        boolean[] is_visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(u);
        while (!q.isEmpty()) {
            Integer v = q.poll();
            if (is_visited[v] == false) {
                is_visited[v] = true;
                System.out.println(v + " ");
                for (Integer i : graph[v]) {
                    if (is_visited[i] == false) {

                        q.offer(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        CreateGraph(graph);
        for (int i = 0; i < graph[3].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print(e.dest + "->");
        }

    }
}
