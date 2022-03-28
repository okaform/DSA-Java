public class factorial {
    //using recursion to try out factorial

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fact(-4));
    }


    public static int fact(int n) {
        if (n <1) {//step 3: the constraint which makes sure only the accepted values are passed through.
            return -1;
        }
        if (n == 1 || n ==0 ) { //step 2: base case which ends the flow
            return  1;
        }
        else { //step 1: recursive case which is the flow
           return n * fact(n - 1);
        }
    }
}
