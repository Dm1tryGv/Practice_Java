package Практика.Практика2.Задание4;

import java.util.Objects;
import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args){
        int index;
        int RAM;
        int HDD;
        int CPC;
        int GPM;

        boolean key = true;

        Shop shop = new Shop();
        Scanner source = new Scanner(System.in);

        Computer[] arr = shop.display();

        for (Computer computer : arr) {
            if (computer != null) {
                System.out.println(computer.toString());
            }
        }

        while(true){
            if (key) {
                System.out.println("Выберите действие (add, del, 0) -> ");
                key = false;
            }

            String input = source.nextLine();

            if (Objects.equals(input, "add")) {
                System.out.println("Введите номер компьютера, который хотите добавить -> ");
                index = source.nextInt();
                System.out.println("Введите RAM компьтера -> ");
                RAM = source.nextInt();
                System.out.println("Введите HDD компьтера -> ");
                HDD = source.nextInt();
                System.out.println("Введите CPC компьтера -> ");
                CPC = source.nextInt();
                System.out.println("Введите GPM компьтера -> ");
                GPM = source.nextInt();

                if (!shop.add_computer(index, RAM, HDD, CPC, GPM)) {
                    System.out.println("Номер компьютера не существует");
                }
                key = true;
            } else if (Objects.equals(input, "del")) {
                System.out.println("Введите номер компьютера, который хотите удалить -> ");
                index = source.nextInt();

                if (!shop.del_computer(index)) {
                    System.out.println("Номер компьютера не существует");
                }
                key = true;
            } else if (Objects.equals(input, "0")) {
                key = true;
                break;
            }

            continue;
        }

        for (Computer computer : arr) {
            if (computer != null) {
                System.out.println(computer.toString());
            }
        }
    }
}
