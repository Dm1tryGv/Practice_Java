package Practice.Practice_2.Задание9;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {

    public static ArrayList<String> CARDS = new ArrayList<>();

    public static Card[] makeHand(){
        Card[] cards = new Card[5];

        for (int i = 0; i < 5; i++){
            cards[i] = new Card();
        }

        return cards;
    }


    public static void main(String[] args){
        Scanner source = new Scanner(System.in);

        System.out.println("Введите количество игроков -> ");
        int n = source.nextInt();

        if (n > 10){
            System.out.println("Максимальное количество игроков 10");
            n = 10;
        }

        if (n < 1){
            System.out.println("Минимальное количество игроков 1");
            n = 1;
        }

        Player[] players = new Player[n];

        for (Player player : players){
            player = new Player(makeHand());
            System.out.println(player.toString());
//            System.out.println(CARDS);
        }


    }
}
