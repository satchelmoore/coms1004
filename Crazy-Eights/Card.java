/** Card.java
*   Author: Satchel Moore
*   
*   
*   Models a typical playing card
*
*/

class Card{
    
    private char suit;
    private int rank;



    // Initializes a card instance
    public Card(char suit, int rank){

        this.suit = suit;
        this.rank = rank;

    }

    // Accessor for suit
    public char getSuit(){
        return suit;
    }
    
    // Accessor for rank
    public int getRank(){
        return rank;
    }

    // Returns a human readable form of the card (eg. King of Diamonds)
    public String toString(){

        String[] rankString = {"Ace", "Two", "Three", "Four", "Five", 
                                "Six", "Seven", "Eight", "Nine", "Ten", 
                                "Jack", "Queen", "King"};

        String suitString = "unrecognized suit";
        switch (suit) {
            case 's': suitString = "Spades";
            break;
            case 'd': suitString = "Diamonds";
            break;
            case 'c': suitString = "Clubs";
            break;
            case 'h': suitString = "Hearts";
            break;
        }

        String desc = rankString[rank - 1] + " of " + suitString;
        return desc;
    }
}