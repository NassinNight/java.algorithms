import java.util.Comparator;
import java.util.List;

public interface ISorting<T> {
    List<T> sort(List<T> list, Comparator<T> comparator);

}
