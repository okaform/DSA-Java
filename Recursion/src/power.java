/*This function accepts a base and an exponent. the function returns the power of the base to the exponent.
* This basically mimics Math.pow() class in java*/

public class power {

    public static void main(String[] args) {
        System.out.println(pow(8,8));
    }

    static int pow(int base, int exponent) {
        if (base <0 || exponent<0) {//step 3: unintentional case
            return -1;
        }
        if (exponent == 0) {//step 2: stopping criteria
            return 1;
        }
        return base * pow(base,exponent -1); //step 1: the recursion base - flow
    }
}
