package Practice.Practice_2.Задание3;

public class Circle {
    public double x = 0.0;
    public double y = 0.0;
    public double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle() {}

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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Практика.Практика2.Задание3.Circle{ " +
                "x = " + x +
                ", y = " + y +
                ", r = " + r +
                " }";
    }
}
