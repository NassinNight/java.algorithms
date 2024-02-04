import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSort<T> implements ISorting<T> {

    @Override
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        List<T> copiedlist = new ArrayList<>(List.copyOf(list));
        for (int i = 0; i < copiedlist.size(); i++) {
            for (int j = 0; j< copiedlist.size()-1;j++) {
                if (comparator.compare(copiedlist.get(j), copiedlist.get(j+1)) > 0) {
                    T temp = copiedlist.get(j);
                    copiedlist.set(j,copiedlist.get(j+1));
                    copiedlist.set(j+1, temp);
                }
            }
        }
        return copiedlist;
    }
}
