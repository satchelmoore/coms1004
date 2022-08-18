/**
*
* Corresponds to excercise E6.3, part D
*
* @author Satchel Moore
* @date 9 February 2022
*/

import java.util.Scanner;

public class E63d {

    public static void main(String[] args) {

        String inputCharacters;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string!");
        System.out.println("I will return the number of vowels!");

        inputCharacters = input.nextLine();

        int numVowels = 0;

        // the following loop checks whether each character is a vowel
        // for each vowel numVowels is incremented by 1

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

                    numVowels = numVowels + 1;

                }  else {
                    ;
                }
                
            

        }

        System.out.println("There are a total of " + numVowels + " vowels!");

      

    }
}