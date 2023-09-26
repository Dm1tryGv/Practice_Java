package Практика.Практика2.Задание2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x;
        double y;
        Ball ball = new Ball();
        System.out.println( ball.toString() );
        Scanner source = new Scanner(System.in);
        System.out.println("Сместить по x на -> ");
        x = source.nextDouble();
        System.out.println("Сместить по y на -> ");
        y = source.nextDouble();
        ball.move(x, y);
        System.out.println("\n" + ball.toString() );
    }
}
