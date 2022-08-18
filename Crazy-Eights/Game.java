/** Game.java
*   Author: Satchel Moore
*   
*   
*   Game class for playing crazy eights in commandline
*   To be used with Player, Card, Deck classes
*
*/


import java.util.Scanner;
import java.util.ArrayList;

class Game{

    public char currentSuit; // need in case an 8 is played
    public Card faceup; 
    private Scanner inputGame;
    private Player p1;
    private ArrayList<Card> compHand;
    private Deck cards;
    
    // sets up the Game object for play
    public Game(){
          
        inputGame = new Scanner(System.in);
        p1 = new Player();
        cards = new Deck();
        compHand = new ArrayList<Card>();
        faceup = cards.deal();    
        currentSuit = faceup.getSuit();

    }

    // accessor for current suit String
    public String currentSuitToString(char current) {

        String suitToString;

        switch (current) {
            case 's': suitToString = "Spades";
            break;
            case 'd': suitToString = "Diamonds";
            break;
            case 'h': suitToString = "Hearts";
            break;
            case 'c': suitToString = "Clubs";
            break;
            default: suitToString = "Unrecognized Suit";
        }

        return suitToString;

    }


    public Card getFaceup() {
        return faceup;
    }
   

    // Plays a game of crazy eights. 
    // Returns true to continue playing and false to stop playing
    public boolean play(){

        boolean keepGoing = true;


        for (int i = 0; i < 8; i++) {

            p1.addCard(cards.deal());         
            
        }

        for (int j = 0; j < 8; j++) {
            
            compHand.add(cards.deal());
            
        }

        // heading/title to start the game

        System.out.println("Welcome to Crazy Eights!");
        System.out.println("First, I will lay out the rules:");
        System.out.println("Each player is dealt 7 cards.");
        System.out.println("Match one of your cards to the face-up card.");
        System.out.println("You can do this by matching the suit or rank!");
        System.out.println("You can use an 8 card to switch the suit.");
        System.out.println("The first to run out of cards wins!");
        System.out.println("If the deck runs out,");
        System.out.println("the player with the fewest remaining cards wins!");
        System.out.println("Now, let the game begin!");
        System.out.println("*************************");
        System.out.println("");

        while (keepGoing) {

            System.out.println("The face-up card is the " + faceup.toString());
            System.out.println("The current suit is " + currentSuitToString(currentSuit));
            System.out.println("");
            System.out.println("You have the following hand:");
            System.out.println(p1.handToString());

            boolean isNotValidCard = true;
            Card p1Played = new Card('l', 14);

            while (isNotValidCard) {     

            p1Played = p1.playsTurn(cards);

            if (p1Played.getSuit() != faceup.getSuit() && 
                p1Played.getRank() != faceup.getRank() && 
                p1Played.getRank() != 8) {
                    System.out.println("That play is not valid. Try again.");
                    isNotValidCard = true;

                } else {
                    (p1.getHand()).remove(p1Played);
                    isNotValidCard = false;
                }
            }


            // checks if player hand is empty

            if ((p1.getHand()).isEmpty()) {
                keepGoing = false;
                System.out.println("You won! You ran out of cards!");
                break;
            }

            // checks if cards are left in the deck

            if (cards.getTop() == 51) {

                keepGoing = false;
                deckRunsOut();

            } 

            currentSuit = (p1Played).getSuit();
            faceup = (p1Played);

            Card compPlayed = computerTurn();

            System.out.println("The computer played " + (compPlayed.toString()));

            if (cards.getTop() == 51) {

                keepGoing = false;
                deckRunsOut();

            }

            // check if computer hand is empty (game ends)
            if (compHand.isEmpty()) {
                
                keepGoing = false;
                System.out.println("You lost! The computer has no cards left.");

            }
        }

        return keepGoing;

    }

    /* Naive computer player AI that does one of two actions:
        1) Plays the first card in their hand that is a valid play
        2) If no valid cards, draws until they can play

        You may choose to use a different approach if you wish but
        this one is fine and will earn maximum marks
     */
     private Card computerTurn(){

         boolean compHasCard = false;
         Card computerPlay = new Card('s', 5);

         for (int f = 0; f <= compHand.size() - 1; f++) {
            // checks compHand to find matching suit or rank
             if ((compHand.get(f)).getSuit() == faceup.getSuit() || 
             (compHand.get(f)).getRank() == faceup.getRank()) {

                 compHasCard = true;

                 faceup = compHand.get(f);
                 computerPlay = compHand.get(f);
                 compHand.remove(f);
                 break;

             }
         }

         if (!(compHasCard)) {

             boolean compDrawAgain = true;

             while (compDrawAgain) {

             

                 compHand.add(cards.deal());
                 System.out.println("Computer drew a card.");
                 
                

                 for (int m = 0; m <= compHand.size() - 1; m++) {

                    if ((compHand.get(m)).getSuit() == faceup.getSuit() || 
                        (compHand.get(m)).getRank() == faceup.getRank()) {

                        faceup = compHand.get(m);
                        computerPlay =  compHand.get(m);
                        compHand.remove(m);
                        compDrawAgain = false;
                                
                    } else {
                        compDrawAgain = true;
                    }
                     
                }

                
      
           

            }

        }

    currentSuit = computerPlay.getSuit();
    return computerPlay;

    }
    
    // method to handle the deck running out
    // ends game and compares hand sizes to declare winner
    public void deckRunsOut() {
        System.out.println("The deck has run out!");
        if ((p1.getHand()).size() < compHand.size()) {
            System.out.println("You win!");
        } else if ((p1.getHand()).size() > compHand.size()) {
            System.out.println("You lost!");
        } else if ((p1.getHand()).size() == compHand.size()) {
            System.out.println("It is a draw!");
        }
    }

}