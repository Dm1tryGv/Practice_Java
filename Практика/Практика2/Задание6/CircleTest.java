package Практика.Практика2.Задание6;


public class CircleTest {
    public static void main(String[] args) {

        Circle[] circles;

        int length = 3;

        circles = new Circle[length];


        circles[0] = new Circle(1, 2,3);
        circles[1] = new Circle(2, 3,4);
        circles[2] = new Circle(3, 4,5);


        System.out.println(circles[0].toString());
        System.out.println(circles[1].toString());
        System.out.println(circles[2].toString());

        System.out.println("Площадь круга 0 = " + circles[0].getArea());
        System.out.println("Длинна окружности 1 = " + circles[1].getLength());
        System.out.println( Circle.Comparison(circles[1], circles[2]));
    }
}
