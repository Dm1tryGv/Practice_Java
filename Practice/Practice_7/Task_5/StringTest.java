package Practice.Practice_7.Task_5;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args){
        Stringble str = new StringFunc();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        System.out.println("Количество эелементов в строке: " + str.charCount(string));
        System.out.println("Строка нечётных элементов исходной строки: " + str.uneven(string));
        System.out.println("Инвертированная строка: " + str.invert(string));
    }
}
