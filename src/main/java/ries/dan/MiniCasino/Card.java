package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public class Card {
    private Rank rank;
    private Suit suit;

    protected Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    protected Rank getRank() {
        return rank;
    }

    protected Suit getSuit(){
        return suit;
    }

    protected String displayCard(){
        String suit = this.getSuit().getValue();
        String rank = this.getRank().getValue();
        String card = (rank + " of " + suit);
        return card;
    }


}
