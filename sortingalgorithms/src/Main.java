import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random randInt = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0;i<10;i++) {
            list.add(randInt.nextInt(0,100));
        }
        ISorting<Integer> sortingAlgorithm = new BubbleSort<>();
        ISorting<Integer> sortingAlgorithm2 = new InsertionSort<>();
        CountingSort sortingAlgorithm3 = new CountingSort();
        ISorting<Integer> sortingAlgorithm4 = new MergeSort<>();
        ISorting<Integer> sortingAlgorithm5 = new MergeSort<>();
        List<Integer> sortedlist = sortingAlgorithm.sort(list, Comparator.naturalOrder());
        List<Integer> sortedlist2 = sortingAlgorithm2.sort(list, Comparator.naturalOrder());
        int[] sortedlist3 = sortingAlgorithm3.sort(list);
        List<Integer> sortedlist4 = sortingAlgorithm4.sort(list, Comparator.naturalOrder());
        List<Integer> sortedlist5 = sortingAlgorithm5.sort(list, Comparator.naturalOrder());
        System.out.println(list);
        for (int i:sortedlist) {
            System.out.print(i+" ");
        }
        for (int i:sortedlist2) {
            System.out.print(i+" ");
        }
        for (int i:sortedlist3) {
            System.out.print(i+" ");
        }
        for (int i:sortedlist4) {
            System.out.print(i+" ");
        }
        for (int i:sortedlist5) {
            System.out.print(i+" ");
        }
        long end=System.currentTimeMillis();
        System.out.println(" ");
        System.out.println(end-start);
    }
}