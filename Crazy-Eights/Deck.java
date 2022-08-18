/** Deck.java
*   Author: Satchel Moore
*   
*   Models a typical deck of playing cards
*   To be used with Card class
*
*/

import java.util.Random;


class Deck{

    private Card[] deck; // contains the cards to play with
    public int top; // controls the "top" of the deck to deal from

    // constructs a default Deck
    public Deck(){
        
        deck = new Card[52];
        top = 0;
        
        int i = 0;
        // fills the deck with each card
        for (int suit = 1; suit < 5; suit++) {
            for (int rank = 1; rank < 14; rank++) {

                char suitChar;
                switch (suit) {
                    case 1: suitChar = 's';
                    break;
                    case 2: suitChar = 'd';
                    break;
                    case 3: suitChar = 'c';
                    break;
                    case 4: suitChar = 'h';
                    break;
                    default: suitChar = 'x';
                }
                deck[i] = new Card(suitChar, rank);
                i++;
            }
        }

        shuffle();

        
    }

    // accessor for the deck
    public Card[] getDeck() {

        return deck;

   }

   // accessor for the top index
   public int getTop() {

       return top;
   
   }

    //Deals the top card off the deck
   public Card deal(){

       Card dealtCard = new Card('l', 13);

       if (top != 51) {
      dealtCard = deck[top++];
       } 

       return dealtCard;

    }

  


    // returns true provided there is a card left in the deck to deal
    public boolean canDeal(){

        boolean cardsLeft = false;

        for (int d = 0; d <= deck.length - 1; d++) {
            if (deck[d] != null) {
                cardsLeft = true;
            }
        }

        return cardsLeft;       
   }

    // Shuffles the deck given an array of cards
    static private void shuffle(Card[] deckToShuffle){     
       Random randomNum = new Random();
        for (int i = 0; i < deckToShuffle.length - 2; i++) {            
            int index = randomNum.nextInt(deckToShuffle.length - i) + i;
            Card j = deckToShuffle[i];
            deckToShuffle[i] = deckToShuffle[index];
            deckToShuffle[index] = j;
        }             
    }

    public void shuffle() {
        shuffle(deck);
        top = 0;
    }

    // Returns a string representation of the whole deck
    public String toString(){
       String wholeDeck = "";
       for (int x = 0; x < deck.length - 1; x++) {
           wholeDeck += deck[x].toString() + "\n";
       }
       return wholeDeck;
    }

    // you may wish to have more helper methods to simplify
    // and shorten the methods above.
}