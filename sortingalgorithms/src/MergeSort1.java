import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort1<T> implements ISorting<T> {

    public List<T> quick_sort(List<T> list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int pi = partition(list, low, high, comparator);
            quick_sort(list, low, pi, comparator); // Note: pi is included because the partition is exclusive
            quick_sort(list, pi + 1, high, comparator);
        }
        return list;
    }

    private int partition(List<T> arr, int low, int high, Comparator<T> comparator) {
        T pivot = arr.get(high); // using the last element as pivot for simplicity
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (comparator.compare(arr.get(j), pivot) <= 0) {
                i++;

                // swap arr[i] and arr[j]
                T temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        T temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    @Override
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        return quick_sort(list, 0, list.size() - 1, comparator);
    }
}

