//To calculate the greatest common factor between two positive numbers
public class GCD  {
    public static void main(String[] args) {
        System.out.println(gcd(48,12));
        System.out.println(gcdProf(12, 12));
    }


    static int gcd(int numerator, int denominator) {
        if (denominator> numerator) {//step 3. the constraint/ unintentional base
            int temp = numerator;
            numerator = denominator;
            denominator = temp;
        }
        if (denominator == 0) { //step 2: stopping criteria
            return numerator;
        }
        return numerator%denominator + gcd(denominator, numerator%denominator); //step one: recursive base
    }

    static int gcdProf(int a, int b){
        if (a<0 || b<0) {//step 3
            return -1;
        }
        if (b ==0) {//step two
            return a;
        }
        return gcdProf(b,a%b);//step one
    }
}
