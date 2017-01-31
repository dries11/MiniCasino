package ries.dan.MiniCasino;

/**
 * Created by danries on 1/28/17.
 */
public class IOGoFish extends IO {

    public void welcomeGoFish(){
        displayBreak();
        System.out.println("Welcome to Go Fish!");
        displayBreak();
    }

    public String playerAskForCard(){
        System.out.println("What card would you like to ask for?");
        return input.next();
    }

    public Rank cardAskedFor(String cardRank){
        Rank askedFor = Rank.ACE;
        cardRank.toLowerCase();
        switch (cardRank){
            case "two":
            case "2":
                askedFor = Rank.TWO;
                break;
            case "three":
            case "3":
                askedFor = Rank.THREE;
                break;
            case "four":
            case "4":
                askedFor = Rank.FOUR;
                break;
            case "five":
            case "5":
                askedFor = Rank.FIVE;
                break;
            case "six":
            case "6":
                askedFor = Rank.SIX;
                break;
            case "seven":
            case "7":
                askedFor = Rank.SEVEN;
                break;
            case "eight":
            case "8":
                askedFor = Rank.EIGHT;
                break;
            case "nine":
            case "9":
                askedFor = Rank.NINE;
                break;
            case "ten":
            case "10":
                askedFor = Rank.TEN;
                break;
            case "queen":
            case "Q":
                askedFor = Rank.QUEEN;
                break;
            case "jack":
            case "J":
                askedFor = Rank.JACK;
                break;
            case "king":
            case "K":
                askedFor = Rank.KING;
                break;
            case "ace":
            case "A":
                askedFor = Rank.ACE;
                break;
            default:
                System.out.println("Not a Card");
        }
        return askedFor;
    }

    public void playerDoesntHaveCard(){
        System.out.println("Go Fish!");
    }

}
