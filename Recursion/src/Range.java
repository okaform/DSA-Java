/*This function accepts a number and adds up all the numbers from 0 to the number passed inclusively*/
public class Range {
    public static void main(String[] args) {
        System.out.println(recursiveRange(10));
        System.out.println(recursiveRange(6));
    }

    static int recursiveRange(int num) {
        if (num <0) {//step 3 unintentional case
            return -1;
        }
        if (num == 0) {//step2 base case / stopping criteria
            return 0;
        }
        return num + recursiveRange(num -1); //step 1: recursive case
    }
}
