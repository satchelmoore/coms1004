/**
*
* Corresponds to excercise E6.3, part C
*
* @author Satchel Moore
* @date 9 February 2022
*/

import java.util.Scanner;

public class E63c {

    public static void main(String[] args) {

        String inputCharacters;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string!");
        System.out.println("I will return every vowel as an underscore!");

        inputCharacters = input.nextLine(); 

        StringBuilder result = new StringBuilder();

        result.append(inputCharacters);

        char underscore = '_';

        // the following loop checks whether each character is a vowel
        // for each vowel the character is replaced with an underscore

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

                    result.setCharAt(i, underscore);

                }  else {
                    ;
                }
                
            

        }

        System.out.println(result.toString());

    }
}