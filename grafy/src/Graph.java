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
                    matrixx[r-1][c-1]=1;
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


    public void bfs(Integer s) {
        List<Integer> answer;
        MyQueue<Integer> queue;
        HashMap<Integer, Integer> colors;
        colors = new HashMap<>();
        answer = new ArrayList<>();
        queue = new MyQueue<>();
        for (int i : V) {
            colors.put(i, -1);
        }
        colors.replace(s, -2);
        queue.push(s);
        while (!queue.isEmpty()) {
            s = queue.pop();
            answer.add(s);
            colors.replace(s, -2);
            for (Edge e : adj.get(s)) {
                if (colors.get(e.v2) == -1) {
                    queue.push(e.v2);
                    colors.replace(e.v2, -2);
                }
                if (colors.get(e.v1) == -1) {
                    queue.push(e.v1);
                    colors.replace(e.v1, -2);
                }
            }
        }
        System.out.println(colors);
        queue.wyswietl();
        System.out.println(answer);

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

