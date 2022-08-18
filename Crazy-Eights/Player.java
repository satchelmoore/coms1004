/** Player.java
*   Author: Satchel Moore
*   
*   Player class as part of Crazy Eights
*   To be used with Game, Card, Deck classes
*
*/

import java.util.ArrayList;
import java.util.Scanner;

class Player{
    
    private ArrayList<Card> hand; // the player's hand
    private Scanner input;

    public Player(){

         input = new Scanner(System.in);
         hand = new ArrayList<Card>();
        
    }

    // Adds a card to the player's hand
    public void addCard(Card c){

        hand.add(c);
        
    }
   
    // Covers all the logic regarding a human player's turn
    // public so it may be called by the Game class
    public Card playsTurn(Deck deck){

        
        
        System.out.println("It is your turn!");
        System.out.println("Type draw to draw a card, or");
        System.out.println("the number next to one of your cards to play it.");

        boolean playerDrawAgain = true;

        // itilializing cards to default
        Card cardDrawn = new Card('s', 5);
        Card cardPlayed = new Card('s', 5);

        

        

        while (playerDrawAgain) {

            String playerMove = input.nextLine();

            if (playerMove.equals("draw")) {

                hand.add(deck.deal());
                System.out.println(handToString());
            
            }

            if (!(playerMove.equals("draw"))) {
                int playerMoveNum = Integer.parseInt(playerMove);
                cardPlayed = hand.get(playerMoveNum - 1);            
                //hand.remove(playerMoveNum - 1);
                System.out.println("You played " + (cardPlayed).toString());
                playerDrawAgain = false;
             }

        }
       
        return cardPlayed;

    }

    
    // Accessor for the players hand
    public ArrayList<Card> getHand(){
        return hand;
    }

    // Returns a printable string representing the player's hand
    public String handToString(){
        
        String playerHand = "";
       for (int i = 0; i < hand.size() - 1; i++) {
           playerHand += (i + 1) + ".   " + (hand.get(i).toString()) + "\n";
       }
       return playerHand;
    }


} // end
