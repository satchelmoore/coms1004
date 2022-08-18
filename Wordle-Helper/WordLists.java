//*************************************
//
//  WordLists.java
//
//  Class to aid with Wordle
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Satchel Moore
//  Your Uni: scm2206
//**************************************

import java.util.ArrayList;


public class WordLists{

   


    public static ArrayList<String> lengthN(ArrayList<String> words, int n){
        
       ArrayList<String> resA = new ArrayList<String>();

       for (int i = 0; i < words.size(); i++) {

          if ((words.get(i)).length() == n) {
             resA.add(words.get(i));
          }

       }
       return resA;
    }

    public static ArrayList<String> letterAt(ArrayList<String> words, 
      char included, int index){
         
         ArrayList<String> resB = new ArrayList<String>();

         for (int i = 0; i < words.size(); i++) {

            if ((words.get(i)).length() >= index - 1) {

               if ((words.get(i)).charAt(index) == included) {
                  resB.add(words.get(i));
               }

            }

         }
         return resB;
    }


    public static ArrayList<String> notAt(ArrayList<String> words,
      char included, int index){
         
         ArrayList<String> resC = new ArrayList<String>();

         for (int i = 0; i < words.size(); i++) {

            if ((words.get(i)).contains(Character.toString(included)) && 
                 (words.get(i)).length() >= index - 1) {
               if ((words.get(i)).charAt(index) != included) {
                  resC.add(words.get(i));
               }
            }

         }

         return resC;
    }

 
    public static ArrayList<String> notIn(ArrayList<String> words,
      char included){
         
         ArrayList<String> resD = new ArrayList<String>();

         for (int i = 0; i < words.size(); i++) {
            if (!((words.get(i)).contains(Character.toString(included)))) {
               resD.add(words.get(i));
            }
         }

         return resD;
    }

} // end of class








