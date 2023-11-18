package Practice.Practice_13;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        String number;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите номер телефона: ");
            number = scanner.next();
            if(number.charAt(0) == '+' && number.length() == 12 && isCorrectNumber(number)) {
                break;
            } else if (number.charAt(0) == '8' && number.length() == 11 && isCorrectNumber(number)) {
                break;
            }
        }

        System.out.println(phoneNumber(number));
    }

    public static String phoneNumber(String number){
        String phoneNumber = "+";

        if (number.charAt(0) == '+')
            number = number.substring(1);
        else if (number.charAt(0) == '8') {
            number = "7" + number.substring(1);
        }

        phoneNumber += number.charAt(0) + number.substring(1, 4) + "-" + number.substring(4, 7) + "-" + number.substring(7);

        return phoneNumber;
    }


    public static boolean isCorrectNumber(String number) {
        char[] chars = number.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
