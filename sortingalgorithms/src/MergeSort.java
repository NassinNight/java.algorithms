import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort<T> implements ISorting<T> {
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        List<T> copiedlist = new ArrayList<>(List.copyOf(list));
        if (copiedlist.size() > 1) {
            int mid = copiedlist.size() / 2;
            List<T> arr_left = new ArrayList<>(copiedlist.subList(0, mid));
            List<T> arr_right = new ArrayList<>(copiedlist.subList(mid, copiedlist.size()));
            arr_left = sort(arr_left, comparator);
            arr_right = sort(arr_right, comparator);
            int k = 0;
            int l = 0;
            int r = 0;
            while (l < arr_left.size() && r < arr_right.size()) {
                if (comparator.compare(arr_left.get(l), arr_right.get(r)) > 0) {
                    copiedlist.set(k, arr_right.get(r));
                    r++;
                } else {
                    copiedlist.set(k, arr_left.get(l));
                    l++;
                }
                k++;
            }
            while (l < arr_left.size()) {
                copiedlist.set(k, arr_left.get(l));
                l++;
                k++;
            }
            while (r < arr_right.size()) {
                copiedlist.set(k, arr_right.get(r));
                r++;
                k++;
            }
        }
        return copiedlist;
    }
}

