package ries.dan.MiniCasino;

/**
 * Created by danries on 1/27/17.
 */
public class Choices {

    BlackJack bj = new BlackJack();
    GoFish gf = new GoFish();

    public boolean gameChoice(int choice){
        boolean status;
        if (choice == 1){
            status = bj.runGame();
        }
        else if (choice == 2){
            status = gf.runGame();
        }
        else{
            status = false;
        }
        return status;
    }
}
