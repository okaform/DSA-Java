package QuickSort;

//time complexity - 0(NLogN), space complexity - 0(N)
public class QuickSort {
    //helper function
    static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start -1;

        for (int j = start; j <=end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return i;
    }

    //total time complexity - 0(NLogN)
    public static void quickSort(int[] arr, int start, int end) { // T(N) time complexity
        if (start < end) {
            int pivot = partition(arr, start, end); // 0(N) time complexity
            quickSort(arr, start, pivot - 1); // T(N/2) time complexity
            quickSort(arr, pivot + 1, end); // T(N/2) time complexity
        }
    }



    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
