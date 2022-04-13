import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperature? ");
        int userInput = input.nextInt();
        int [] arr = new int[userInput];
        for (int i =0; i< userInput; i++) {
            System.out.print("Day " + (i + 1) +"'s high temp: ");
            arr[i] = input.nextInt();
        }

        int average = average(arr);

        System.out.println("Average = " + average);

        System.out.println(above(arr, average) + " days above average");
    }

    public static int average(int [] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total/arr.length;
    }

    static int above(int [] arr, int average) {
        int count = 0;
        for (int i =0; i < arr.length; i++) {
            if (average > arr[i]) {
                count++;
            }
        }
        return count;

    }
}
