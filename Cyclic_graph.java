
import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int s) {
        boolean visited[] = new boolean[V];

        // LinkedList<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> sw = new Stack<Integer>();

        visited[s] = true;
        sw.add(s);

        while (sw.size() != 0) {
            s = sw.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    sw.add(n);
                }
            }
        }
    }

    void iscycle(int s) {
        boolean visited[] = new boolean[graph.length];

        // LinkedList<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> sw = new Stack<Integer>();
        boolean f = false;

        sw.push(s);

        while (sw.size() != 0) {
            int v = sw.pop();
            if (visited[v] == false) {
                visited[v] = true;
                for (int i : graph[v]) {
                    if (visited[i] == false && sw.indexof(i) >= 0) {
                        System.out.println("yes");
                        f = false;
                        break;
                    }
                    if (visited[i] == false) {

                    }
                }

            }
        }
        if (f) {
            System.out.println("no");

        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(2);
        System.out.println(s.indexof(2));
    }

    public static void graph() {

        boolean[] is_visited = new boolean[7];

        for (int i = 0; i < is_visited.length; i++) {

        }

    }

}
