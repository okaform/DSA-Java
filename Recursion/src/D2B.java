import java.util.ArrayList;
import java.util.List;

/*this class is to convert decimal numbers to binary*/
public class D2B {
    public static void main(String[] args) {
       // System.out.println(d2b(10));
        System.out.println(d2bProf(10));
    }

    static int d2b(int num) {
        if (num<0) {//step 3: the constraint or unintentional case
            return  -1;
        }

        if (num/2 == 0) {//step two: stopping criteria
            return 1;
        }

        //System.out.println(num%2);
        return d2b(num/2); //step one: base recursion
    }

    //The formula - f(n) = n mod 2 + 10 * f(n/2)
    static int d2bProf(int n) {
        if (n < 0) {
            return -1;
        }
        if (n ==0) { //step 2
            return 0;
        }
        return n%2 + 10 * d2bProf(n/2); //step 1
    }

}
