Satchel Moore
scm2206
5 March 2022

Part 1.

For part 1, I created a new computer player using the ComputerPlayer class.
I used the parameter of 0.5 because that way there would be an equal likelihood of the 
computer selecting 1 or 2, since 0.5 is exactly between 0 and 1.

I created a while loop with a set number of rounds which would allow the game
to be played a number of times with the score being kept cumulatively
across the different rounds. To determine which number the computer chooses, I used
an if statement in the ComputerPlayer class which generates a random number
and selects 0 or 1 depending on if it is greater or less than 0.5. I used
Math.random() found in Java documentation in order to generate a random number.

Part 2.

For part two, I used a while loop to run through a certain amount of games just as I did 
in part 1. However, instead of taking user input, I initialized two computer players and
had them both "play" the game. In my computer player class, I created a new method
which generated two diffetent random numbers for these two players. The other
reason I created a separate method was because I did not want the print
statement from part 1 to run since there would be so many simulations being run.

For the Simulation class, I used a nested for loop. With this loop,
I was able to keep one threshold at the same value while the other threshold
was incremented by 0.05, and do that for every threshold. Then, the one that
was being held at one value would be incremented and the other would be held at
one value. The simulation then prints the final number of tokens and thresholds 
to make it easy to detect patterns and analyze the results.

Results.

Through running the simulation a number of times, I was able to sift through 
the numbers and detect a pattern. The odd player seemed to be at an advantage in this
game when the odd player selected 0.6 as a threshold value. With 0.6 selected, the 
odd player was consistently winning the game, as opposed to other values where 
the result seemed to be truly random.

