package MergeSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,8,4,1,7,6};
        MergeSort ms = new MergeSort();
        System.out.println("before sorting");
        ms.print(arr);
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println("\n After sorting");
        ms.print(arr);

        int arrs [] = new int[2];
    }
}
