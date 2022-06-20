package week04;

import java.util.Scanner;

public class SevenDotOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] fiveNo = new double[5];
        System.out.println("Enter 5 numbers : "); //step 2


        for (int i = 0; i < fiveNo.length; i++) {
            System.out.print("No " + (i + 1) +" : ");
            fiveNo[i] = input.nextDouble(); //step 3
        }

        double mean = mean(fiveNo);
        System.out.println("The mean is " + String.format("%5.2f", mean)); //step 5

        double std = deviation(fiveNo);
        System.out.println("The Standard Deviation is " + String.format("%5.2f", std)); //step 5

        System.out.println("Goodbye ..."); //step 6

    }

    public static double mean(double[] x) { //step 4
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;
    }

    public static double deviation(double[] x) { //step 4
        double mean = mean(x);
        double std = 0;
        for (int i = 0; i < x.length; i++) {
            std += Math.pow((x[i] - mean), 2);
        }
        return Math.sqrt(std / (x.length - 1));
    }
}
