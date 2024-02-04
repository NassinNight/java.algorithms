import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuickSort<T> implements ISorting<T>{
    public List<T> quick_sort(List<T> list,int low, int high, Comparator<T> comparator) {
        if (low<high) {
            int pi = partition(list, low, high,comparator);
            quick_sort(list,low,pi,comparator);
            quick_sort(list,pi+1,high,comparator);
        }
        return list;
    }
    private int partition(List<T> arr, int low, int high,Comparator<T> comparator) {
        T pivot = arr.get(low);
        int i = low-1;
        int j = high+1;
        while(true) {
            do {i++;} while (comparator.compare(arr.get(i),pivot) <0);
            do {j--;} while (comparator.compare(arr.get(j),pivot) >0);
            if (i>=j) {
                return j;
            }
            T temp= arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
    }
    @Override
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        return quick_sort(list,0,list.size()-1,comparator);
    }
}
