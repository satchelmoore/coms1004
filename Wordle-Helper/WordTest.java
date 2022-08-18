//
//  WordTest.java
//
//  Class to test WordLists
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Satchel Moore
//  Your Uni: scm2206
//**************************************

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    public static void main(String[] args){

        

        try {

        File inFile = new File("wordlist.txt");
        Scanner input = new Scanner(inFile);
        String word;
        PrintWriter output = new PrintWriter("out.txt");
        ArrayList<String> master = new ArrayList<String>();

        // fills "master" with all words from wordlist
        while (input.hasNext()) {

            word = input.nextLine();
            master.add(word);
        }

        ArrayList<String> myList = WordLists.lengthN(master, 4);
        myList = WordLists.letterAt(myList, 'j', 0);
        myList = WordLists.notAt(myList, 'v', 1);
        myList = WordLists.notIn(myList, 'e');
        myList = WordLists.notIn(myList, 'i');

        // fills output file with all elements of new, narrowed-down list
        for (int i = 0; i < myList.size(); i++) {
            output.println(myList.get(i));
        }
        
        output.flush();
        output.close();
        

        } catch (FileNotFoundException e) {
            System.out.println("Make sure wordlist.txt exists, and try again");
        }

               
}

}