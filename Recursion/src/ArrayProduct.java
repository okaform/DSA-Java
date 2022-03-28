/*This class takes an array of numbers and returns the product of them all
* */

public class ArrayProduct {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(productofArray(arr, arr.length));
    }

    static int productofArray(int A[],int N) {
        if (N<0) {
            return -1;
        }
        if (N < 1) {//step 2: base case/stopping criteria
            return 1;
        }
        return A[N-1]* productofArray(A, N-1); //step one: recursion case
    }
}
