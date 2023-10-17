package Practice.Practice_2.Задание1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String email;
        Author author = new Author("Peter", "peter2000@gmail.com", 'm');
        System.out.println( author.toString() );
        Scanner source = new Scanner(System.in);
        System.out.println("Введите почту -> ");
        email = source.nextLine();
        author.setEmail(email);
        System.out.println("\n" + author.toString() );
    }
}
