package week08;

import java.sql.SQLOutput;

public class eightDotOne {
    public static void main(String[] args) {
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter. ");

        rectangle rec1 = new rectangle(40,4);
        rectangle rec2 = new rectangle(5,3.5);
        rectangle[] recArray = new rectangle[2];
        recArray[0] = rec1;
        recArray[1] = rec2;
        int i = 1;

        for (rectangle rec : recArray) {
            System.out.println("Rectangle " + i + ":");
            System.out.println("Height = " + String.format("%5.2f", rec.getHeight()));
            System.out.println("Width = " + String.format("%5.2f", rec.getWidth()));
            System.out.println("Area = " + String.format("%5.2f", rec.getArea()));
            System.out.println("Perimeter = " + String.format("%5.2f", rec.getPerimeter()) + "\n");
            i++;
        }
        System.out.println("Goodbye ...");
    }

    public static class rectangle {
        public double width = 1;
        public double height = 1;

        rectangle() {

        }

        rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        /*Start of Getters and Setters method*/
        public double getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
        /*End of Getters and Setters method*/

        public double getArea() {
            return (width * height);
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }


    }
}
