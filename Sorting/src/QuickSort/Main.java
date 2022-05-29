package QuickSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,8,4,1,7,6};
        QuickSort qs = new QuickSort();

        System.out.println("before sorting");
        qs.print(arr);

        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("\n After sorting");
        qs.print(arr);

    }
}
