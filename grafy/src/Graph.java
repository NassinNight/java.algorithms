import java.util.*;

public class Graph {
    Set<Integer> V;
    List<Edge> E;
    HashMap<Integer, List<Edge>> adj;

    public Graph(List<Edge> e) {
        E = e;
        V = extractVertexes(e);
    }

    private Set<Integer> extractVertexes(List<Edge> edges){
        Set<Integer> vertexes = new HashSet<>();
        for (Edge edge: edges ) {
            vertexes.add(edge.v1);
            vertexes.add(edge.v2);
        }
        return vertexes;
    }
    public void matrix() {
        int[][] matrixx = new int[E.size() + 1][E.size() + 1];
        for (int i = 0; i < E.size() + 1; i++) {
            matrixx[i][0] = i;
            for (int j = 0; j < E.size() + 1; j++) {
                matrixx[0][j] = j;
            }
        }
        for (Integer r: V) {
            for(Integer c: V) {
                if(E.contains(new Edge(r,c)))
                    matrixx[r][c]=1;
            }
        }
        for (int[] tab : matrixx) {
            for (int x: tab) {
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void adj() {
        adj = new HashMap<>();
            for (int i: V) {
                    adj.put(i,new ArrayList<>());
            }
            for (Edge e: E) {
                if (e.v1.equals(e.v2)) {
                    adj.get(e.v1).add(e);
                } else {
                    adj.get(e.v1).add(e);
                    adj.get(e.v2).add(e);
                }


            }

        System.out.println(adj);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "V=" + V +
                ", E=" + E +
                ", adj=" + adj +
                '}';
    }
}

