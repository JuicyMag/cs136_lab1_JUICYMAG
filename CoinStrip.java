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

    int coins; 

    public CoinStrip(int numCoins, int size){ //I use numCoins in public static void main
        coins = numCoins ; 
        myBoard = new int[size];
        Scanner scan = new Scanner(System.in); 

        for(int i = 0 ; i < myBoard.length; i++){
            myBoard[i] = 0; 
        }


        int k = 0; 
        
        while(k < numCoins){
            int test = rng.nextInt(myBoard.length);
            if(myBoard[test] == 0){
                myBoard[test] = 1;
                k++; 

            } 


        }

        while(!gameOver()){
            System.out.println(toString());

            System.out.println("What coin do you want to move");
            int coinSelected = scan.nextInt(); 

            System.out.println("How far do you want to move?");
            int movesChoosen = scan.nextInt(); 

            

        }


    }

    public void findAndMove(int coin, int sizeMove){

        int i = 0;
        int pos = 0;
        while(i < coin){
            if(myBoard[pos] == 1){
                i++;
            } 
            pos++; 
            // myBoard[pos]
        } 
        pos--;//overshoot at the last case compensation

        for(int h = 1; h <= sizeMove; i++){
            if(pos - sizeMove > 0){
                if((myBoard[pos] - sizeMove) == 0 ){
                    pos = pos - sizeMove; 
                }

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





    public boolean gameOver(){

        for(int i = 0; i < coins ; i++){
            if(myBoard[i] == 0){
                return false; 
            }


        }
        return true; 
    }


    //         gameHasFinished = false ;  //do I need anything else to end loop?


    //         if (gameHasFinished){
    //             gameInSession= false; 
    //             System.out.println ("Game Over!");

    //             if(player1Turn){
    //                 System.out.println("Player 1 is the WINNER");
    //             } else{
    //                 System.out.println("Player 2 is the WINNER");
    //         }
    
    //      while(gameInSession){

    //         //able to print message conditional on whose turn it is
    //         if(player1Turn){
    //             System.out.println("Player 1 - it's your move!");
    //             }else{
    //                 System.out.println("Player 2 - please make a move!");
    //         }
    //      }


    //     }
    // }
    






    public static void main(String[] args){
        // new random number generator 
        Random rngMain = new Random(); 

        //new scanner to take in coins
        Scanner sc = new Scanner(System.in); 

        //prints question, number of coins
        System.out.println("How many coins would you like to play with? Minimum = 4 coins, and Maximum = 8 coins"); 


        //NUMBER OF COINS = input from user 
        int coins = sc.nextInt(); 


        //checks to see if value of coin is between 4 and 8
        while(coins < 4 || coins > 8){
            System.out.println("INVALID INPUT -Please pick another value");
            coins = sc.nextInt(); // this is important, this is how many coins are selected 
        }

        //creating board given number of coins that are selected 
        int boardSize = coins*(rngMain.nextInt(3) + 2) ; 

        //creating new coinstrip
        CoinStrip board = new CoinStrip(coins, boardSize);


        System.out.println(board.toString());


        

        //creating scanner, allows for interaction and allows for user to input the number of coins
        




        
    } 


}