
class Graph {
    // Inner class to keep track of edges
    class Edge {
        int src, dest;
    }

    // Number of vertices and edges
    int vertices, edges;

    // Array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // Initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {
            // Each element of the edge array is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        int noVertices = 5;
        int noEdges = 8;
        Graph g = new Graph(noVertices, noEdges);

        // Create graph
        g.edge[0].src = 1; // edge 1---2
        g.edge[0].dest = 2;
        // ... (similarly add other edges)

        // Print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }
    }
}
