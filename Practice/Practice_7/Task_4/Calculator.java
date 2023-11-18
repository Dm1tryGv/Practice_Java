package Practice.Practice_7.Task_4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    static String[] operationsOfTwo = {"moduleOfComplex", "pow", "0"};
    static String[] operationsOfOne = {"circleArea", "circleLength", "0"};

    public static void main(String[] args){

        MathCalculable mathFunc = new MathFunc();

        double x;
        double y;
        String operation;

        Scanner source = new Scanner(System.in);

        System.out.println(Arrays.toString(operationsOfTwo));
        System.out.println(Arrays.toString(operationsOfOne));

        System.out.println();

        while(true) {
            boolean status = true;

            while (true) {
                System.out.println("Введите мат. операцию: ");
                operation = source.next();
                if (Objects.equals(operation, "0")) {
                    status = false;
                }
                if (Arrays.asList(operationsOfOne).contains(operation) || Arrays.asList(operationsOfTwo).contains(operation)) {
                    break;
                }
                System.out.println("Ошибка ввода");
            }

            if (!status){
                break;
            }

            if (Arrays.asList(operationsOfOne).contains(operation)) {
                System.out.println("a: ");
                double R = source.nextDouble();
                switch(operation){
                    case ("circleArea"):
                        System.out.println("Ответ: " + mathFunc.circleArea(R));
                        break;
                    case ("circleLength"):
                        System.out.println("Ответ: " + mathFunc.circleLength(R));
                        break;
                }
            }

            if (Arrays.asList(operationsOfTwo).contains(operation)) {
                System.out.println("a: ");
                x = source.nextDouble();

                System.out.println("b: ");
                y = source.nextDouble();
                switch(operation){
                    case ("moduleOfComplex"):
                        System.out.println("Ответ: " + mathFunc.moduleOfComplex(x, y));
                        break;
                    case ("pow"):
                        System.out.println("Ответ: " + mathFunc.pow(x, y));
                        break;
                }
            }


        }
        System.out.println("Конец работы программы");
    }
}
