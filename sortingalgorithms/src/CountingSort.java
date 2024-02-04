import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.max;

public class CountingSort {
    public int[] sort(List<Integer>list) {
        List<Integer> copiedlist = new ArrayList<>(List.copyOf(list));
        System.out.println(copiedlist);
        int max_val=max(copiedlist);
        int[] output = new int[copiedlist.size()];
        int[] count= new int[max_val+1];
        int i=0;
        while(i<copiedlist.size()) {
            count[(copiedlist.get(i))]+=1;
            i=i+1;
        }
        i=1;
        while(i<max_val+1) {
            count[i]+=count[i-1];
            i=i+1;
        }
        i=0;
        while(i<copiedlist.size()) {
            output[count[copiedlist.get(i)]-1] = copiedlist.get(i);
            count[copiedlist.get(i)] -= 1;
            i=i+1;
        }
        return output;
    }
}
