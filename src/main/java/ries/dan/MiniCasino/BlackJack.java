package ries.dan.MiniCasino;

import java.util.ArrayList;

/**
 * Created by danries on 1/27/17.
 */
public class BlackJack extends Games{

    private Games BlackJack = new Games();

    private IOBlackJack ioBlackJack = new IOBlackJack();

    public boolean runGame(){
        ArrayList<Card> playerHand;
        ArrayList<Card> dealerHand;

        do {
            Deck deck = new Deck();
            playerHand = deal();
            dealerHand = deal();
            boolean playing = true;

            ioBlackJack.displayCardAmount(calculateCardAmount(playerHand), calculateCardAmount(dealerHand));

            while (playing) {

                int condition = checkHands(dealerHand, playerHand);

                if (condition == 2) {
                    ioBlackJack.dealerWins();
                    playing = false;
                } else if (condition == 3) {
                    ioBlackJack.playerWins();
                    playing = false;
                }
                if (ioBlackJack.hitOrStay() == 1) {
                    playerHand.add(deck.drawCard());
                }
                if (aiDealer() == 0) {
                    dealerHand.add(deck.drawCard());
                }

            }
        }
        while(ioBlackJack.playAgain(ioBlackJack.promptPlayAgain()));
        return false;
    }


    protected ArrayList<Card> deal(){
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 2; i ++){
            hand.add(BlackJack.deck.drawCard());
        }
        return hand;
    }

    protected int checkHands(ArrayList<Card> dealer, ArrayList<Card> player){
        int condition = 1; //Play On
        if (didWin(dealer) || didBreak(player)){
            condition = 2; //dealer Wins
        }
        else if (didWin(player) || didBreak(dealer)){
            condition = 3; //Player Wins
        }
        return condition;
    }

    protected int calculateCardAmount(ArrayList<Card> hand){
        int amount = 0;
        String value;
        for (int i = 0; i < hand.size(); i++){
            value = (hand.get(i).getRank().getValue());
            if (value.equals("ACE")) {
                amount+= 1;
            }
            else if (value.equals("JACK") || value.equals("QUEEN")|| value.equals("KING")){
                amount += 10;
            }
            else
                amount += Integer.parseInt(hand.get(i).getRank().getValue());
        }
        return amount;
    }

    protected boolean didWin(ArrayList<Card> hand){
        boolean status = false;
        if (calculateCardAmount(hand) == 21){
            status = true;
        }
        return status;
    }

    protected boolean didBreak(ArrayList<Card> hand){
        boolean status = true;
        if (calculateCardAmount(hand) <= 21){
            status = false;
        }
        return status;
    }

    protected int aiDealer(){
        double choice = (Math.random() + 1);
        if (choice < .75){//Stay
            return 1;
        }
        return 0;//Hit
    }

}
