import java.util.Scanner;

public class while_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        int sum = 0;

        int i = 0;
        do {
            System.out.print("Введите " + i + " элемент массива: ");
            int elem = scan.nextInt();
            sum += elem;
            nums[i] = elem;
            i++;
        } while(i < n);

        int max = 0;
        int min = 1000000000;
        int k = 0;

        while(k < n){
            if(nums[k] >= max){
                max = nums[k];
            }
            if(nums[k] <= min){
                min = nums[k];
            }
            k++;
        }

        System.out.print("nums = [");

        for(int j = 0; j < n; j++){
            if (n - j > 1) {
                System.out.print(nums[j] + ", ");
            } else {
                System.out.print(nums[j] + "]");
            }
        }

        float average = (float)sum / n;

        System.out.print("\nСумма элементов массива = " + sum);
        System.out.print("\nСреднее арифметическое элементов массива = " + average);
        System.out.print("\nМинимальный элемент массива: " + min);
        System.out.print("\nМаксимальный элемент массива: " + max);

        for (int p = 0; p < args.length; p++) {
            System.out.println("Аргумент " + (p+1) + ": " + args[p]);
        }

        System.out.println(args.length);
    }
}
