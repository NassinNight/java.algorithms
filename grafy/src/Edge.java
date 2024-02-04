import java.util.Objects;

public class Edge {
        Integer v1;
        Integer v2;

    public Edge(Integer v1, Integer v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(v1, edge.v1) && Objects.equals(v2, edge.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }

    @Override
    public String toString() {
        return String.valueOf(v1+ "-" + v2);
    }
}
