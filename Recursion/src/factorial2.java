/*This function accepts a number and returns the factorial of that number*/

public class factorial2 {
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

    static int fact(int num) {
        if (num <0) {//step 3: unintentional case
            return -1;
        }
        if (num == 0) {//step 2base case/stopping criteria
            return 1;
        }
        return num * fact(num - 1);//step 1 : recursive case
    }
}
