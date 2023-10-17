package Practice.Practice_3;

import java.util.Scanner;

public class Shell {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);

        System.out.println("1) Введите число -> ");
        String input = source.nextLine();

        Double a = Double.valueOf(input);
        Double D = Double.parseDouble(input);

        byte b = Byte.parseByte(String.valueOf(D));
        short s = Short.parseShort(String.valueOf(D));
        int i = Integer.parseInt(String.valueOf(D));
        long l = Long.parseLong(String.valueOf(D));
        float f = Float.parseFloat(String.valueOf(D));
        double d = D;
        boolean B = Boolean.parseBoolean(String.valueOf(D));
        char c = String.valueOf(D).charAt(0);

        System.out.println(D);

        String g = Double.toString(3.14);
    }
}
