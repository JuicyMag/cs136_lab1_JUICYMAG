import java.util.Random;
import java.util.Scanner;

// Magnus Herweyer CoinStrip

// Just like problem sets I kept account of who helped me
// Derek Chen 21, Michael Wong 19, Vincent Lin 19, Jian Lu 19 (TA), Justin Kwon 21 all helped me think about how to structure CoinStrip
// and debug!

public class CoinStrip{

    // random number generator used for size of board 
    Random rng = new Random(); 

    //Able to keep track of if game is still going on, and whose turn it is
    boolean player1Turn = true; 
    boolean gameInSession = true; 
    
    int[] myBoard; // stores all values
        
    public CoinStrip(int numCoins, int size){ //I use numCoins in public static void main
        myBoard = new int[size];

        for(int i = 0 ; i < myBoard.length; i++){
            myBoard[i] = 0; 
        }

    }

    public void gameOver(){
        boolean gameHasFinished = true;

        for(int k = 0; k < boardSize.length; k++){
          //if visual[k].equals what the fuck does this need to equal to check if game is live?


            gameHasFinished = false ;  //do I need anything else to end loop?
        }

        if (gameHasFinished){
            gameInSession= false; 
            System.out.println ("Game Over!")

            if(player1Turn){
                System.out.println("Player 1 is the WINNER");
            }else{
                System.out.println("Player 2 is the WINNER");
            }
        }
    }
    

    public String toString(){

        String board = ""; 

        for(int i = 0; i < myBoard.length; i++){
            // if it IS a coin
            if(myBoard[i] != 0){
                //then add
                board = board + "x|"; 
            } else {
                board = board + "_|"; 
            }

        }

        return board;

    }


    //method to check the rule that coins CANNOT be stacked in the same space
    public void checkifCoinStacked(int i){

        for(int k = 0; k < i; k++){
            if(sizeBoard[i] == sizeBoard[k]){
                sizeBoard[i] = rng.nextInt(sizeBoard);
            }
        }

    }

    public static void main(String[] args){
        CoinStrip c = new CoinStrip(5, 10);
        System.out.println(c.toString());

        // //creating scanner, allows for interaction and allows for user to input the number of coins
        // Scanner sc = new Scanner(System.in); 

        // // I am not sure the OPTIMAL way to have a min and max constraint but it seemed logical to tell the user that there is a
        // // min and max choice, there are trolls in this world that would mash their keyboards and create 430965243523 coins... can't allow
        // System.out.println("How many coins would you like to play with? Minimum = 4 coins, and Maximum = 8 coins"); 

        // // defining coins outside of while loop
        // int coins = sc.nextInt(); 

        // //able to track if the game is in session or not
        // while(gameInSession){

        //     //able to print message conditional on whose turn it is
        //     if(player1Turn){
        //         System.out.println("Player 1 - it's your move!")
        //     }else{
        //         System.out.println("Player 2 - please make a move!")
        //     } 

        //     int moveForCoinSelected = Math.abs(in.nextInt()) ; // User tells computer how much to move selected coin 
        //     int coinSelected = sc.nextInt(); // Tells computer which coin I am referring to

        // }


        // // Next logical step is to PLACE the coins given I have created how many exist
        // // only way to place a coin is to check ALL conditions, while, if, for, etc

        // //conditions 
        // int oldMove = myBoard[coins]
        // int newMove = myBoard[coins] - moveForCoinSelected; 

        // if(coins>= 0 && coins<sizeBoard.length){

        //     // need to be able to keep track of the old position and current position in case of violation of coniditions           

        // }


        // // while the user puts in values that ARE NOT VALID, read them their error and prompt them to re-enter a valid value
        // // to commence game

        while(coins < 4 || coins > 8){
            System.out.println("INVALID INPUT -Please pick another value");
            coins = sc.nextInt(); // this is important, this is how many coins are selected 
        }

        //enables me to have a min of 4 and max of 8
        int a = 4+rng.nextInt(5); 

        // given the user can vary the size of the coins played with, I need the board to vary in size, I handle this generating 
        // that is between 2 and 5. [2,5] acts a constant that is randomly generated to vary the size of the board. I want there to be some variability in the 
        // game so that it is not mundane
        int boardSize = rng.nextInt(3) + 2 ; 

        //System.out.println(boardSize) ; //visual, this is important later 

        CoinStrip board = new CoinStrip(coins, boardSize); 

    }
}