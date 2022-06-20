package week09;

public class MyPoint {
    //step 1
    public int x;
    public int y;

    //step 3
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    //step - 4
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //step 2
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //step 5
    public double distance(int xCoord, int yCoord) {
        return Math.sqrt(Math.pow((xCoord - this.x), 2) + Math.pow((yCoord - this.y), 2));
    }

    //step 6
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
    }

    //step 7
    public static double distance(MyPoint mp1, MyPoint mp2) {
        return Math.sqrt(Math.pow((mp1.x - mp2.x), 2) + Math.pow((mp1.y - mp2.y), 2));
    }
}
