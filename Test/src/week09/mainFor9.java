package week09;

import java.util.Scanner;

public class mainFor9 {
    public static void main(String[] args) {
        //step 1
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.");

        //step 2
        MyPoint p1 = new MyPoint();
        Scanner input = new Scanner(System.in);

        //step 3 and 4
        System.out.print("\nEnter the x coordinate of a point: ");
        int x = input.nextInt();
        System.out.print("Enter the y coordinate of a point: ");
        int y = input.nextInt();

        //step 5 - uses first calc method
        System.out.println("Using method 1, the distance from (" + p1.x +"," + p1.y + ") " +
                "to (" +x +"," + y +") is " +
               String.format("%5.2f",p1.distance(x,y)));

        //step 6 -
        MyPoint p2 = new MyPoint(x,y);

        //step 7 - uses second and third calc method
        System.out.println("Using method 2, the distance from (" + p1.x +"," + p1.y + ") " +
                "to (" +p2.x +"," + p2.y +") is " +
                String.format("%5.2f",p1.distance(p2)));

        System.out.println("Using method 3, the distance from (" + p1.x +"," + p1.y + ") " +
                "to (" +p2.getX() +"," + p2.getY() +") is " +
                String.format("%5.2f",p1.distance(p1,p2)));

        //step 8 -
        System.out.println("Goodbye....");


    }
}
