import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Map {
    Card[][] cards;


    public Map(int n,int m) {
        this.cards= new Card[n][m];
       // System.out.println("hello world");
        generateMap();
    }

    private void generateMap() {
        List<Card> list= generateList();
        for(int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
               // System.out.println(list);
                cards[i][j]= list.remove((int)(Math.random()*list.size()));
            }
        }
    }
    private List<Card> generateList() {
        List<Card> list= new ArrayList<>();
        int cardValue = 1;
        for (int i = 0; i< (cards.length*cards[0].length)/2;i++) {
            list.add(new Card(cardValue,false));
            list.add(new Card(cardValue,false));
            cardValue++;
        }
    return list;
    }
    public void printMap() {
        for(int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                System.out.print(cards[i][j]+ " ");
            }
            System.out.println("");
        }
    }

}
