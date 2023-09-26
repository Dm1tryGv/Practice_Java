package Практика.Практика2.Задание3;

public class Point {
    public double x = 0.0;
    public double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Практика.Практика2.Задание3.Point{ " +
                "x = " + x +
                ", y = " + y +
                " }";
    }
}
