

public class MainList {
    public static void main(String[] args) {
        StackinList newStack = new StackinList();
        System.out.println(newStack.peek());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        /*boolean result1 = newStack.isEmpty();
        System.out.println(result1);*/

        System.out.println(newStack.peek());

        newStack.deleteStackList();

        System.out.println(newStack.peek());

        int k =10;
        String n = "593";

        String ok = "";
        int i = 0;
        while(i < k ) {
            ok +=n;
            i++;
        }

        System.out.println(ok);

        long third = Long.parseLong(ok);

        //int third = 123123123;

        while (third /10 != 0) {
            third = remainder(third);
        }

        System.out.println( third);


    }
    public static long remainder(long number) {
        if (number == 0) { //base case. stopping criteria
            return 0;
        }
        else {
            //step 1- flow recursive base
            return number % 10 + remainder(number / 10);
        }
    }
}
