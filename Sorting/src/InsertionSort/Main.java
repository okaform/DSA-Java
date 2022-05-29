package InsertionSort;


public class Main {
    public static void main(String[] args) {
        int arr[] = {10,3,12,200,30,20,1,50};

        InsertionSort is = new InsertionSort();
        System.out.println("\nBefore Sorting");
        is.print(arr);
        is.insertionSort(arr);

        System.out.println("\nAfter Sorting");
        is.print(arr);
    }
}
