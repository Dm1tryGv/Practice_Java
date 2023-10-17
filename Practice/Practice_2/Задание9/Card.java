package Practice.Practice_2.Задание9;


public class Card {

   public String[] suits = new String[4];
   public String[] ranks = new String[13];

   public String card;

   public void Cards() {
       suits[0] = "Крести";
       suits[1] = "Черви";
       suits[2] = "Пики";
       suits[3] = "Бубны";

       ranks[0] = "Туз";
       ranks[1] = "2";
       ranks[2] = "3";
       ranks[3] = "4";
       ranks[4] = "5";
       ranks[5] = "6";
       ranks[6] = "7";
       ranks[7] = "8";
       ranks[8] = "9";
       ranks[9] = "10";
       ranks[10] = "Валет";
       ranks[11] = "Дама";
       ranks[12] = "Король";
   }

   public Card(){
       Cards();

       while(true) {
           int a = (int) (Math.random() * 4);
           int b = (int) (Math.random() * 13);

           String tmp = ranks[b] + " " + suits[a];
           if (!Poker.CARDS.contains(tmp)){
               this.card = tmp;
               Poker.CARDS.add(tmp);
               break;
           }
       }
   }

    @Override
    public String toString() {
        return "Card{" +
                "card='" + card + '\'' +
                '}';
    }

    public String Check() {
        return card;
    }
}
