/**
*
* Corresponds to excercise E6.3, part A, returning uppercase characters
*
* @author Satchel Moore
* @date 9 February 2022
*/

import java.util.Scanner;

public class E63a {

    public static void main(String[] args) {

        String inputCharacters;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string!");
        System.out.println("I will return the uppercase characters!");

        inputCharacters = input.nextLine(); 



        StringBuilder result = new StringBuilder();

        // the following loop checks whether each character is uppercase
        // isWhitespace accounts for if the character is a space

        for (int i = 0; i <= (inputCharacters.length() - 1); i++) {

            if (Character.isUpperCase(inputCharacters.charAt(i))){

                    result.append(inputCharacters.charAt(i));

                } else if (Character.isWhitespace(inputCharacters.charAt(i))) {
                    ;
                } else {
                    ;
                }
                
            

        }

        // uppercase characters printed as one string
        System.out.println(result.toString());

    }
}