import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void main(String[] args) {

       // fibo(0,1);
     //   var result = fiboProf(4);
       // System.out.println(result);

        for (int i =0; i< 20; i++) {//print out the first 20 numbers of the fibonacci series
            System.out.println(fiboProf(i));
        }
    }

    public static int fibo(int a, int b) {
        int first = a;
        int second = b;
        if (a == 0 && b == 1) {
            System.out.println(a + "\n" + b);
        }
        if (a +b < 0) { //step two: the base case. The stopping criteria
            return 0;
        }
        System.out.println(a+b);
        return fibo(b, a+b); //step one: recursive case - flow

    }

    //This returns one number in the fibonacci series
    public static int fiboProf(int n) {
        if (n<0) {//step 3: constraint
            return -1;
        }
        if (n ==0 || n ==1) {//step 2; stopping criteria
            return n;
        }
        return fiboProf(n -1) + fiboProf(n -2); //step 1: basic flow
    }
}
