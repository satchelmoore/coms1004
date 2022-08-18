Satchel Moore
scm2206
18 April 2022
PP5

WordLists.java

For my WordList class, I felt pretty comfortable writing the methods, drawing on the various forms 
of string manipulation we have covered in class thus far. I used for loops in order to iterate through each characte
of each word in the list in order to find whether letters were placed in the correct spots or not.
For each of these methods, I returned new ArrayLists with the modifications completed.

WordTest.java

For this class, most of my code was wrapped in try/catch statement, in which I used a catch statement 
specifically for a FileNotFoundException. This catch statement accounts for a scenario in which the 
file named in the code does not actually exist in the directory for some reason. 
Otherwise, I imported the wordlist.txt file and used a while loop to copy each word of the document
into an array list. From there, I just called all the methods in the instructions, and then printed
the resultant array list into an output text file.