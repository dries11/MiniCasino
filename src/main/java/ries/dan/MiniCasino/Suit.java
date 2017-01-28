package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public enum Suit {
    HEART("HEART"),
    SPADE("SPADE"),
    DIAMOND("DIAMOND"),
    CLUB("CLUB");

    private String val;

    Suit(String val) {
        this.val = val;
    }

    public String getValue() {
        return this.val;
    }
}
