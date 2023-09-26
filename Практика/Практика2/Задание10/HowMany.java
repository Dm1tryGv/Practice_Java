package Практика.Практика2.Задание10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        Scanner source = new Scanner(System.in);

        String input = source.nextLine();

        System.out.println("Cлов в строке: " + input.split(" +").length);
    }
}
