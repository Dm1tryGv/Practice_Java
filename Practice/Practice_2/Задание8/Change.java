package Practice.Practice_2.Задание8;

import java.util.Arrays;
import java.util.Scanner;

public class Change {
    public static void main(String[] args){
        Scanner source = new Scanner(System.in);

        System.out.println("Введите количество элементов -> ");
        int n = source.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите " + i + " элемент массива -> ");
            arr[i] = source.nextLine();
        }

        for (int j = n-1; j > 0; j--){
            String tmp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
