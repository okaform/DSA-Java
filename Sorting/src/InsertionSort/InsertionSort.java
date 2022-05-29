package InsertionSort;

public class InsertionSort {
    //Insertion Sort - time conplexity is 0(N) squared and space is 0(1)
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp= arr[i], j = i;
            while (j > 0 && arr[j -1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }


    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
