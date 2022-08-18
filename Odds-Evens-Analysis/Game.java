/**
 * This class represents the Odd-Even game
 * Satchel Moore (scm2206)
 * 5 March 2022
 */

 import java.util.Scanner;
 

public class Game{
    
    // your instance variables here:

    private Scanner input;
    private ComputerPlayer p2;
    private int playerOneScore;
    private int playerTwoScore;
    private ComputerPlayer compOne;
    private ComputerPlayer compTwo;

    
/* this version of the game constructor is for Part 1
 * it takes no parameters */
    public Game(){
        // your code here

        p2 = new ComputerPlayer(0.5);
        input = new Scanner(System.in);
        playerOneScore = 0;
        playerTwoScore = 0;

    }
    
/* this version of the game constructor is for Part 2
 * It requires two doubles as parameters. You will use 
 * these to set the initial thresholds for you computer players */
    public Game (double t1, double t2){
        // your code here
        compOne = new ComputerPlayer(t1);
        compTwo = new ComputerPlayer(t2);
        
    }
    
/* this version of the play method is for Part 1
 * It takes no parameters and should play the interactive
 * version of the game */
    public void play(){
        

        System.out.println("------------------------");
        System.out.println("Welcome to the PP3 Game!");
        System.out.println("------------------------");

        System.out.println("You are P1. You want the sum to be odd.");
        
        int i = 1;
        
        

        while (i <= 100000) {

            System.out.println("Round " + i);
            System.out.println("Choose 'one' or 'two'");
            
            
            String userInput = input.nextLine();
            
            p2.compPlay();

            if (userInput.equals("one") && p2.computerInput == 1) {
                playerOneScore = playerOneScore - 2;
                playerTwoScore = playerTwoScore + 2;
                System.out.println("You lost!");
                System.out.println("You have " + playerOneScore + " tokens.");
                System.out.println("P2 has " + playerTwoScore + " tokens.");
            } else if (userInput.equals("one") && p2.computerInput == 2) {
                playerOneScore = playerOneScore + 3;
                playerTwoScore = playerTwoScore - 3;
                System.out.println("You won!");
                System.out.println("You have " + playerOneScore + " tokens.");
                System.out.println("P2 has " + playerTwoScore + " tokens.");
            } else if (userInput.equals("two") && p2.computerInput == 1) {
                playerOneScore = playerOneScore + 3;
                playerTwoScore = playerTwoScore - 3;
                System.out.println("You won!");
                System.out.println("You have " + playerOneScore + " tokens.");
                System.out.println("P2 has " + playerTwoScore + " tokens.");
            } else if (userInput.equals("two") && p2.computerInput == 2) {
                playerOneScore = playerOneScore - 4;
                playerTwoScore = playerTwoScore + 4;
                System.out.println("You lost!");
                System.out.println("You have " + playerOneScore + " tokens.");
                System.out.println("P2 has " + playerTwoScore + " tokens.");
            }  else {;} 

            System.out.println("*******************");

            i++;

            

        }
    }
    
    
/** this version of the play method is for Part 2
 * It takes a single int as a parameter which is the
 * number of computer vs. computer games that should be played */
    public void play(int games){

        int g = 0;

        while (g <= games) {
            
            compOne.compPlaySim();
            compTwo.compPlaySim();

            if (compOne.compOneInput == 1 && compTwo.compTwoInput == 1) {
                playerOneScore = playerOneScore - 2;
                playerTwoScore = playerTwoScore + 2;
                
            } else if (compOne.compOneInput == 1 && compTwo.compTwoInput == 2) {
                playerOneScore = playerOneScore + 3;
                playerTwoScore = playerTwoScore - 3;
                
            } else if (compOne.compOneInput == 2 && compTwo.compTwoInput == 1) {
                playerOneScore = playerOneScore + 3;
                playerTwoScore = playerTwoScore - 3;
                
            } else if (compOne.compOneInput == 2 && compTwo.compTwoInput == 2) {
                playerOneScore = playerOneScore - 4;
                playerTwoScore = playerTwoScore + 4;
                
            }  else {;}

            g++;


        

 
        }

        
      
    }

/* this method should return the current score (number of tokens)
 * that player 1 has */
    public int getP1Score(){
        
        return playerOneScore;
        
    }
    
/* this method should return the current score (number of tokens)
 * that player 2 has */
    public int getP2Score(){
        
        return playerTwoScore;
        
    }  
    
    
    // you may or may not want more methods here:
    
    
}