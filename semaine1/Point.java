package semaine1;
import java.lang.Math;


public class Point {
    private double x, y;
    
    public Point() {
        x = 100;
        y = 100;
    }

    public Point(double x, double y) {
        this.x = (x<0) ? 0 : x; // condition if else plus facile
        this.y = (y<0) ? 0 : y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private void set(double newX, double newY) {
        if(newX >= 0) x = newX;
        if(newY >= 0) y = newY;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
