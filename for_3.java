import java.util.Scanner;

public class for_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Введите " + i + " элемент массива: ");
            int elem = scan.nextInt();
            sum += elem;
            nums[i] = elem;
        }

        System.out.print("nums = [");

        for(int i = 0; i < n; i++){
            if (n - i > 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i] + "]");
            }
        }

        System.out.print("\nСумма элементов массива = " + sum);
        System.out.print("\nСреднее арифметическое элементов массива = " + sum/n);
    }
}