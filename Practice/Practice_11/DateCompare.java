package Practice.Practice_11;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args){

        LocalDate currentDate = LocalDate.now();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите день: ");
        int day = scanner.nextInt();

        LocalDate inputDate = LocalDate.of( year , month , day );

        System.out.println("Текущая дата " + currentDate);
        System.out.println("Введёная дата " + inputDate);

        if (currentDate.isAfter(inputDate)){
            System.out.println(inputDate + " раньше чем " + currentDate);
        } else {
            System.out.println(inputDate + " позже чем " + currentDate);
        }
    }
}
