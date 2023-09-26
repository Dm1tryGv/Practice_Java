package Практика.Практика2.Задание7;

import java.util.Objects;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){

        BookShelf shelf = new BookShelf();

        Scanner source = new Scanner(System.in);

        boolean key = true;

        while(true){
            if (key) {
                System.out.println("Выберите действие (add, del, new, old, sort, show, exit) -> ");
                key = false;
            }
            String input = source.nextLine();

            if (Objects.equals(input, "add")) {
                System.out.println("Введите автора книги -> ");
                String author = source.nextLine();
                System.out.println("Введите название книги -> ");
                String name = source.nextLine();
                System.out.println("Введите год выпуска книги -> ");
                int year = source.nextInt();

                Book book = new Book(author, name, year);

                shelf.addBook(book);

                key = true;

            } else if (Objects.equals(input, "del")) {
                System.out.println("Введите номер книги -> ");
                int index = source.nextInt();

                shelf.delBook(index-1);

                key = true;

            } else if (Objects.equals(input, "new")) {

                System.out.println(shelf.findNew().toString());

                key = true;

            } else if (Objects.equals(input, "old")) {

                System.out.println(shelf.findOld().toString());

                key = true;

            } else if (Objects.equals(input, "sort")) {

                shelf.shelfSort();

                key = true;

            } else if (Objects.equals(input, "show")) {

                System.out.println("\n");

                System.out.println("Список книг:");

                for (int i = 0; i<shelf.shelf.length; i++){
                    System.out.println(i+1 + ") " + shelf.shelf[i].toString());
                }

                System.out.println("\n");

                key = true;

            } else if (Objects.equals(input, "exit")) {
                break;
            }
            continue;
        }
    }
}
