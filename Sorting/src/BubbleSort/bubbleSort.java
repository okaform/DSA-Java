package BubbleSort;

public class bubbleSort {
//time complexity is 0(N) squared. space complexity is 0(1)
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -i - 1; j++ ) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
