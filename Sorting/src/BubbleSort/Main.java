package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10,5,12,200,30,20,1,50};
        bubbleSort bs = new bubbleSort();
        System.out.println("\nBefore Sorting");
        bs.print(arr);
        bs.bubbleSort(arr);
        System.out.println("\nAfter Sorting");
        bs.print(arr);

    }
}
