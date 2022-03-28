public class SumOfDigits {
    /*How to find the sum of digits of a positive integer number using recursion
    * for example 10 or 11 or 1234*/
    public static void main(String[] args) {
        System.out.println(remain(0142)); // when numbers start with zero they are read as hex, I think
    }

     static int remain(int n) {
        if (n <0) {//step 3: constraint for negative numbers
            return -1;
        }
        if(n/10== 0) {//step 2: stop the flow/ stopping criteria. we are trying to get single digits which means that a divisor result of 0 means that.
            return n;
        }
        return remain(n/10) + remain(n%10); //step one: recursion base - define the flow
     }
}
