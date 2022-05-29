package LinearSearch;

public class LinearSearch {
    public static int linSearch (int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Element is found at the index: " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    //Binary Search
    public static int binarySearch(int[] arr, int value) {
        int leftPointer = 0; //start pointer
        int rightPointer = arr.length - 1; //end pointer
        int middlePointer = (leftPointer + rightPointer) / 2;
        while(arr[middlePointer] != value && leftPointer <= rightPointer) {
            if (arr[middlePointer] > value) {
                rightPointer = middlePointer - 1;
            }
            else {
                leftPointer = middlePointer + 1;
            }
            middlePointer = (leftPointer + rightPointer) / 2;
        }

        System.out.println(arr[middlePointer] +"\n");
        System.out.println(middlePointer);

        if (arr[middlePointer] == value) {
            System.out.println("Element is found at the index: " + middlePointer);
            return middlePointer;
        }
        else {
            System.out.println("Element not found");
            return -1;
        }

    }

}
