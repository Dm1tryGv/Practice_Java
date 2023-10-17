package Practice.Practice_2.Задание3;

public class Tester {
    public static void main(String[] args) {

        Circle[] arr;

        int length = 3;

        arr = new Circle[length];


        arr[0] = new Circle(1, 2,3);
        arr[1] = new Circle(2, 3,4);
        arr[2] = new Circle(3, 4,5);


        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());
    }
}
