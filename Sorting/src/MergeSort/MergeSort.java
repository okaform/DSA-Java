package MergeSort;

public class MergeSort {
    //time complexity - O (N LogN), space complexity - 0(N)
    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //merge method
    static void merge(int[] a, int left, int middle, int right ) {
        int [] leftTmpArray = new int[middle-left + 2];
        int [] rightTmpArray = new int[right - middle + 1];
        //copy all elements from array a to the temporary elements

        for (int i = 0; i<=middle -left; i++) {
            leftTmpArray[i] = a[left+i] ;
        }

        for (int i = 0; i<right - middle; i++) {
            rightTmpArray[i] = a[middle+i + 1]  ;
        }
        //merge into array A
        leftTmpArray[middle -left + 1] = Integer.MAX_VALUE;
        rightTmpArray[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0; //i = for lefttmpArray. j = for righttmpArray
        for (int k = left; k <=right; k++) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                a[k] = leftTmpArray[i];
                i++;
            }
            else {
                a[k] = rightTmpArray[j];
                j++;
            }
        }

    }

    //mergeSort
    static void mergeSort(int[] arr, int left, int right) {
        if (right > left ) {
            int m = (left + right ) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m+1, right);
            merge(arr, left, m , right);
        }
    }
}
