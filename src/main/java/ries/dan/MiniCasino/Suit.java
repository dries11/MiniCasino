package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public enum Suit {
    HEART("1"),
    SPADE("2"),
    DIAMOND("3"),
    CLUB("4");

    private String val;

    Suit(String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}
