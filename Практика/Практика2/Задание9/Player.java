package Практика.Практика2.Задание9;

import java.util.Arrays;

public class Player {
    public Card[] hand = new Card[5];

    public Player(Card[] cards){
        this.hand = cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + Arrays.toString(hand) +
                '}';
    }
}
