import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Map {
    Card[][] cards;
    int factor;

    public Map(int n,int m,int factor) {
        this.cards= new Card[n][m];
        this.factor=factor;
       // System.out.println("hello world");
        generateMap();
    }

    private void generateMap() {
        List<Card> list= generateList(factor);
        for(int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
               // System.out.println(list);
                cards[i][j]= list.remove((int)(Math.random()*list.size()));
            }
        }
    }
    private List<Card> generateList(int factor) {
        List<Card> list= new ArrayList<>();
        int cardValue = 1;
        for (int i = 0; i< (cards.length*cards[0].length)/factor;i++) {
            for (int j = 0; j < factor; j++) {
                list.add(new Card(cardValue, false));
            }
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
