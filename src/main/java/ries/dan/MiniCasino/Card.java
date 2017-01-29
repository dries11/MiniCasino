package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public String displayCard(){
        String suit = this.getSuit().getValue();
        String rank = this.getRank().getValue();
        String card = (rank + " of " + suit);
        return card;
    }


}
