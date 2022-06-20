package week04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

       /* Scanner keyboard = new Scanner(System.in);
        Double investmentAmount = 0.0;
        boolean isPositive = true;

        while (isPositive ==true) {
            System.out.println("Enter a non-positive number - ");

            investmentAmount = keyboard.nextDouble();

            if (investmentAmount < 0 ) { //if the number is negative, print out something to the user. Then do nothing else
                System.out.println("The number is a negative number. Please try again. ");
            }
            else {
                System.out.println("You have entered a positive number. Keep up the good work. ");
                isPositive = false;
            }
        }*/

        double one = 547545;
        double two = 547.545;
        double three = 5.47545;

        System.out.println(" \t\t" + String.format("%5.1f", one ) +
                " \t\t" + String.format("%5.2f", two) + " \t\t" + String.format("%5.3f",three ));



    }

}
