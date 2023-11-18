package Practice.Practice_7.Task_4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double PI() {
        return Math.PI;
    }

    @Override
    public double moduleOfComplex(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double circleArea(double a) {
        return PI() * Math.pow(a, 2);
    }

    @Override
    public double circleLength(double a) {
        return 2 * PI() * a;
    }
}
