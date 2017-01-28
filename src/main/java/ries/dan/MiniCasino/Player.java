package ries.dan.MiniCasino;

import java.util.ArrayList;

/**
 * Created by danries on 1/27/17.
 */
public class Player {
    String name;
    int amountOfMoney;
    ArrayList<Card> hand = new ArrayList<Card>();


    public Player(String name,int amountOfMoney){
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.hand = hand;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}