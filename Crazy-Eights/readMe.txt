Satchel Moore
scm2206
5 April 20122
Programming Project 4

Card :

For my Card class, the process was fairly simple. The class contains accessor methods
for the suit and rank of a given Card, as these elements need to be referenced frequently
when comparing cards and using them in-game. Apart from these, I used an array and
a switch case to create a toString method for a given Card.

Deck :

To fill the default Deck, I used a nested for loop, with the outer loop switching 
between suits, and the inner loop iterating through ranks. This creates a deck full 
of one card of each rank in each suit. I have a few helper methods providing access
to various characteristics of a Deck. The deal method returns the top card of the 
deck, and increases it each time to make its way through the whole deck, stopping when
it reaches the last card. One modification I made to the scaffolding was the creation of 
a different shuffle method which takes an array of Cards, to mke the shuffle method
easieer to word with. 

Game : 

In the Game class, I created a number of my own accessor methods in order to shorten
 methods across the whole program, such as those for the top card and the current suit.
 I used a Scanner to take user input, and I used a while loop which loops the game until
 one of the end scenarios are met, in which case I created a separate method
 for handling the ending of the game. After the user's turn, I created a loop which holds
 true as long as the card they play is valid when compared to the faceup card. For the
 computer's turn, the program loops through the computer's deck and checks if there 
 is a valid, playable card. If not, the computer player draws a card. I created a separate
 class for the scenario where the deck of cards runs out. 

 Player :

 For the Player class, I created a scanner to take user input. I wrapped the contents of the playsTurn
 method in a loop that would repeat if the user chooses to "draw." This way, the player can
 draw as many times as they want until they deem it a good idea to play one of their cards. I also
 created a method for getting the hand, as I would be unable to access it otherwise.
