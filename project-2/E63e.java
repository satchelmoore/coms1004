/**
*
* Corresponds to excercise E6.3, part E
*
* @author Satchel Moore
* @date 9 February 2022
*/

import java.util.Scanner;

public class E63e {

    public static void main(String[] args) {

        String inputCharacters;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string!");
        System.out.println("I will return the positions of vowels!");

        inputCharacters = input.nextLine();

        

        System.out.println("There are vowels in the following positions:");


        // the following loop checks whether each character is a vowel
        // then prints its position if so

        for (int i = 0; i <= (inputCharacters.length() - 1); i++) {

            if (inputCharacters.charAt(i) == 'a' ||
                inputCharacters.charAt(i) == 'A' ||
                inputCharacters.charAt(i) == 'e' ||
                inputCharacters.charAt(i) == 'E' ||
                inputCharacters.charAt(i) == 'i' ||
                inputCharacters.charAt(i) == 'I' ||
                inputCharacters.charAt(i) == 'o' ||
                inputCharacters.charAt(i) == 'O' ||
                inputCharacters.charAt(i) == 'u' ||
                inputCharacters.charAt(i) == 'U') {

                    

                    System.out.println("Position " + i);

                }  else {
                    ;
                }
                
            

        }

        

      

    }
}