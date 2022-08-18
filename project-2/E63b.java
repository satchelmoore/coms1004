/**
*
* Corresponds to excercise E6.3, part B, returning every second letter
*
* @author Satchel Moore
* @date 9 February 2022
*/

import java.util.Scanner;

public class E63b {

    public static void main(String[] args) {

        String inputCharacters;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string!");
        System.out.println("I will return every second letter!");

        inputCharacters = input.nextLine(); 

        StringBuilder result = new StringBuilder();


        // the following loop checks whether each character is a multiple of 2
        // 1 is added to i in each iteration since the index starts at 0
        
        for (int i = 0; i <= (inputCharacters.length() - 1); i++) {

            if (((i + 1) % 2) == 0){

                    result.append(inputCharacters.charAt(i));

                }  else {
                    ;
                }
                
            

        }

        System.out.println(result.toString());

    }
}