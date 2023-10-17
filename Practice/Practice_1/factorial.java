package Practice.Practice_1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите факториал: ");
        int input = scan.nextInt();

        System.out.print(input + "! = " + fact(input));
    }

    public static int fact(int n){

        int result = 1;

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }
}
