package week04;

import java.awt.*;
import java.util.Arrays;

public class SevenDotTwo {
    public static void main(String[] args) {
        //step 1
        System.out.println("This program does something. No user input required.");
        //step 2
        String[] empNames = {"Tara Teamlead", "Harry Hacker", "Carl Coder", "Paula Programmer", "Darrin Debugger"};
        //step 3
        double[][] hours = {
                {0, 8, 8, 8.5, 8, 9,0}, //tara's hours
                {0, 9, 9, 8.5, 8, 7.5,0}, //Harry's hours
                {0, 8.5, 8, 8.6, 8.6, 9.5,2}, //carl's hours
                {0, 4.75, 6, 6.25, 6.5, 0,0}, //paula's hours
                {0, 0, 0, 0, 5.25, 5.25,6}, //Darrin's hours
        };
        //System.out.println(Arrays.toString(empNames));
        //System.out.println(Arrays.deepToString(hours));

        //step 4
        double[] addedHours = new double[hours.length];
        int row = 0;
        for (double[] empHours : hours) {
            for (double num : empHours) {
                addedHours[row] += num;
            }
            row++;
        }

        //System.out.println(Arrays.toString(addedHours));

        //step 5
        System.out.println("Employee Name\t\t\tTotal Hours");
        for (int i = 0; i < empNames.length; i++) {
            System.out.printf("%-23s %.2f %n", empNames[i], addedHours[i]);
        }


        //Extra Credit - Selection Sort
        for (int i = 0; i < addedHours.length - 1; i++) {
            double min_value = addedHours[0];
            int min_idx = i;
            for (int j = i + 1; j < addedHours.length; j++) {
                if (addedHours[j] > addedHours[min_idx]) {//for minimum, change the greater than to less than
                    min_idx = j;
                    double tempHours = addedHours[min_idx];
                    addedHours[min_idx] = addedHours[i];
                    addedHours[i] = tempHours;


                    String tempEmp = empNames[min_idx];
                    empNames[min_idx] = empNames[i];
                    empNames[i] = tempEmp;
                }
            }
        }

        //after sorting
        System.out.println("\n\n-----------------------------------------------\n");
        System.out.println("Employee Name\t\t\tTotal Hours");
        for (int i = 0; i < empNames.length; i++) {
            System.out.printf("%-23s %.2f %n", empNames[i], addedHours[i]);
        }


        //step 6
        System.out.println("\nGoodbye ...");


    }
}
