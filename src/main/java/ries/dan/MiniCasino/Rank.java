package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("JACK"),
    QUEEN("QUEEN"),
    KING("KING"),
    ACE("ACE");

    private String val ;

    Rank(String val) {
        this.val = val;
    }

    public String getValue(){
        return this.val;
    }
}
