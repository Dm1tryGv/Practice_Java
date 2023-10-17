package Practice.Practice_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.util.Arrays.sort;

public class Task1_2 {
    public static void main(String[] args){
        Scanner source = new Scanner(System.in);

        System.out.println("Введите количество элементов массива -> ");
        int n = source.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = new Random().nextInt(101);
        }
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}