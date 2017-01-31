package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public class Main {

    static IO io = new IO();
    static Choices choice = new Choices();

    public static void main(String args[]){

        boolean inside = true;
        boolean playing = true;
        int chosen;

        io.welcomeMain();

        while(inside){
            chosen = io.pickAGame();
            if (chosen == 3){
                break;
            }
            while(playing){
                playing = choice.gameChoice(chosen);
            }

        }

        io.goodbyeMain();

    }

}
