package Practice.Practice_2.Задание6;

public class Circle {
    public double x = 0.0;
    public double y = 0.0;
    public double r = 0.0;

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

    public double getArea(){
        return (Math.PI * Math.pow(this.getR(), 2));
    }

    public double getLength(){
        return (2 * Math.PI * this.getR());
    }

    public static String Comparison(Circle circle1, Circle circle2){
        if (circle1.getArea() > circle2.getArea()){
            return (circle1 + " > " + circle2);
        } else if (circle1.getArea() < circle2.getArea()){
            return (circle2 + " > " + circle1);
        }
        return (circle2 + " = " + circle1);
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "x = " + x +
                ", y = " + y +
                ", r = " + r +
                " }";
    }
}
