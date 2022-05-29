package HeapSort;

public class HeapSort {

    int[] arr = null;
    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insert(arr[i], "Min");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extract("Min");
        }
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
