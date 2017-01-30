package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public class Main {

    static IO io = new IO();
    static Choices choice = new Choices();

    public static void main(String args[]){

        boolean inside = true;

        io.welcomeMain();
        Player player = new Player(io.askForName());

        while(inside){
            choice.gameChoice(io.pickAGame());
        }

        io.goodbyeMain();

    }

}
