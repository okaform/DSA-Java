package BucketSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,8,4,1,7,6};

        BucketSort bs = new BucketSort(arr);
        bs.print(arr);
        bs.bucketSort();
        System.out.println();
        bs.print(arr);
    }
}
