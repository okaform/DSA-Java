package BucketSort;

import java.util.ArrayList;
import java.util.Collections;

//time complexity - O(NLogN) , space complexity : 0(N)
public class BucketSort {

    private  int[] arr;

    public BucketSort(int arr[]) {
        this.arr = arr;
    }

    //print buckets
    public void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for (int j = 0; j< buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }


    //BucketSorting
    public void bucketSort() {
        //find the number of buckets
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        //find the maximum value
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        //create the buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int value: arr ) {
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets)/(float) maxValue);
            buckets[bucketNumber -1].add(value);
        }

        System.out.println("\n\nPrinting buckets before sorting");
        printBucket(buckets);

        for (ArrayList<Integer> bucket: buckets) {
            Collections.sort(bucket); //time complexity - O(NLogN)
        }

        System.out.println("\n\nPrinting buckets After sorting");
        printBucket(buckets);

        //combine the buckets
        int index = 0;
        for (ArrayList<Integer> bucket: buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }

    }


    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
