import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1,2));
        edges.add(new Edge(2,3));
        edges.add(new Edge(4,5));
        edges.add(new Edge(6,7));
        edges.add(new Edge(2,6));
        edges.add(new Edge(6,5));
        edges.add(new Edge(5,2));
        edges.add(new Edge(7,7));
        Graph graph = new Graph(edges);
        graph.matrix();
        graph.adj();
        graph.bfs(1);
    }
}