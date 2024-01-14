import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertionSort<T> implements ISorting<T> {
    @Override
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        List<T> copiedlist = new ArrayList<>(List.copyOf(list));
        int i = 1;
        while (i < copiedlist.size()) {
            T key = copiedlist.get(i);
            int j = i - 1;
            while (j >= 0 && comparator.compare(key, copiedlist.get(j)) < 0) {
                copiedlist.set(j + 1, copiedlist.get(j));
                j = j - 1;
            }
            copiedlist.set(j+1, key);
            i = i + 1;
        }
        return copiedlist;
    }
}



