package Практика.Практика2.Задание5;

import java.util.Objects;
import java.util.Scanner;

public class Kennel {
    public static Dog[] addDog(Dog[] myArray, Dog x) {
        int i;

        Dog[] newArray = new Dog[myArray.length + 1];

        for (i = 0; i < myArray.length; i++)
            newArray[i] = myArray[i];

        newArray[myArray.length] = x;
        return newArray;
    }

    public static void main(String[] args){
        String name;
        int age;

        boolean key = true;

        Dog[] dogs = new Dog[0];

        Scanner source = new Scanner(System.in);


        while(true){
            if (key) {
                System.out.println("Выберите действие (add, 0) -> ");
                key = false;
            }
            String input = source.nextLine();

            if (Objects.equals(input, "add")) {
                System.out.println("Введите кличку собаки -> ");
                name = source.nextLine();
                System.out.println("Введите возраст собаки -> ");
                age = source.nextInt();

                Dog dog = new Dog(name, age);

                dogs = addDog(dogs, dog);

                key = true;

            } else if (Objects.equals(input, "0")) {
                break;
            }
            continue;
        }

        for (Dog dog : dogs){
            if (dog != null) {
                System.out.println(dog.toString());
            }
        }
    }
}
