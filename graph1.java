import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph1<T> {

  private Map<T, List<T>> gmap = new HashMap<>();

  public void add_vertex(T s) {
    gmap.put(s, new LinkedList<T>());
  }

  public void add_edge(T source, T destination) {
    if (!gmap.containsKey(source)) {
      add_vertex(source);
    }
    if (!gmap.containsKey(destination)) {
      add_vertex(destination);
    }
    gmap.get(source).add(destination);
  }

  void count_vetrtex() {
    System.out.println("the no. of vertex in graph is " + gmap.keySet().size());

  }

  void count_edge() {
    int count = 0;
    for (T item : gmap.keySet()) {
      count = count + gmap.get(item).size();
    }
    System.out.println("The graph has " + count
    + " edges.");
  }

}

class GraphImplementation {
  public static void main(String[] args) {
    Graph1<Integer> graph = new Graph1<>();

    graph.add_edge(1, 2);
    graph.add_edge(1, 3);

    graph.add_edge(0, 2);
    graph.add_edge(0, 5);
    // graph.add_edge(1,3);
    // graph.add_edge(1,3);
    // graph.add_edge(1,3);
    // System.out.println("Graph:\n" + gmap.toString());

    // Gives the no of vertices in the graph.
    graph.count_vetrtex();

    // Gives the no of edges in the graph.
    graph.count_edge();

  }
}