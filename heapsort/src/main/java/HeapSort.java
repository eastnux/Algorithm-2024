import javax.swing.event.RowSorterListener;
import java.util.Comparator;
public class HeapSort<E extends Comparable<E>> extends SortList<E> {
    private void list;

    public HeapSort(E[] list) {
        super(list);
    }

    public void sort() {
        buildHeap();
        for (int i = list.length - 1; i >=1; i--){
            list[i] = deleteMax(i+1);
        }
    }

    private void buildHeap() {
        for (int i = (list.length - 2) / 2; i>= 0; i--){
            percolateDown(list.length, i);
        }

    }

    private void deleteMax(int i) {
        return null;
    }
    private void percolateDown(int k) {
        int child = 2 * k + 1;
        int right = 2 * k + 2;

        if (child <= list.length - 1) {
            if (right <= list.length - 1 &&
            list[child].compareTo(list[right]) < 0){
                child = right;
            }
        }

        if (list[k].compareTo(list[child]) < 0) {
            swap(k, child);
            percolateDown(child);
        }
    }
}
