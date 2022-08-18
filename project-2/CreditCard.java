/**
*
* Corresponds to PP2 Problem 2
*
* @author Satchel Moore
* @date 9 February 2022
*/

public class CreditCard {

    private String number;
    private boolean valid;
    private int code;

    // constructor - accepts string input and 
    // initializes number, validity, and error code
    public CreditCard(String creditCardNumber) {
        
        number = creditCardNumber;
        valid = true;
        code = 0;

        
    }

    // the following methods check criteria 1-6

    public void check1() {

        int firstDigit = Integer.parseInt(number.substring(0, 1));

        if (firstDigit != 4) {
            valid = false;
            code = 1;
        }
    }

    public void check2() {

        int fourthDigit = Integer.parseInt(number.substring(3, 4));
        int fifthDigit = Integer.parseInt(number.substring(5, 6));
    
        if (fourthDigit != (fifthDigit + 1)) {
            valid = false;
            if (code == 0) {
                code = 2;
            }
        }
    }

    public void check3() {

        int firstDigit = Integer.parseInt(number.substring(0, 1));
        int fifthDigit = Integer.parseInt(number.substring(5, 6));
        int ninthDigit = Integer.parseInt(number.substring(10, 11));

      
        if (firstDigit * fifthDigit * ninthDigit != 24) {
            valid = false;
            if (code == 0) {
            code = 3;
            }
        }
    }

    public void check4() {
        
        int firstDigit = Integer.parseInt(number.substring(0, 1));
        int secondDigit = Integer.parseInt(number.substring(1, 2));
        int thirdDigit = Integer.parseInt(number.substring(2, 3));
        int fourthDigit = Integer.parseInt(number.substring(3, 4));
        int fifthDigit = Integer.parseInt(number.substring(5, 6));
        int sixthDigit = Integer.parseInt(number.substring(6, 7));
        int seventhDigit = Integer.parseInt(number.substring(7, 8));
        int eighthDigit = Integer.parseInt(number.substring(8, 9));
        int ninthDigit = Integer.parseInt(number.substring(10, 11));
        int tenthDigit = Integer.parseInt(number.substring(11, 12));
        int eleventhDigit = Integer.parseInt(number.substring(12, 13));
        int twelfthDigit = Integer.parseInt(number.substring(number.length() - 1));
        
        if ((firstDigit + secondDigit + thirdDigit + fourthDigit + 
            fifthDigit + sixthDigit + seventhDigit + eighthDigit +
            ninthDigit + tenthDigit + eleventhDigit + twelfthDigit) % 4 != 0) {
            valid = false;
            if (code == 0) {
            code = 4;
            }
        }
    }

     public void check5() {

         int firstDigit = Integer.parseInt(number.substring(0, 1));
         int secondDigit = Integer.parseInt(number.substring(1, 2));
         int thirdDigit = Integer.parseInt(number.substring(2, 3));
         int fourthDigit = Integer.parseInt(number.substring(3, 4));
         int ninthDigit = Integer.parseInt(number.substring(10, 11));
         int tenthDigit = Integer.parseInt(number.substring(11, 12));
         int eleventhDigit = Integer.parseInt(number.substring(12, 13));
         int twelfthDigit = Integer.parseInt(number.substring(number.length() - 1));
        
        if ((firstDigit + secondDigit + thirdDigit + fourthDigit) !=
            ((ninthDigit + tenthDigit + eleventhDigit + twelfthDigit) - 1)) {
            valid = false;
            if (code == 0) {
            code = 5;
            }
        }
    }

    public void check6() {

        int firstPair = Integer.parseInt(number.substring(0, 2));
        int secondPair = Integer.parseInt(number.substring(7, 9));

        if (firstPair + secondPair != 100) {
            valid = false;
            if (code == 0) {
            code = 6;
            }
        }
    }

    // this method checks each support method
    // to check the validity of the number
    public void check() {
        check1();
        check2();
        check3();
        check4();
        check5();
        check6();
    }

    // accessor method for validity
    public boolean isValid() {
        return valid;
    }
    // accessor method for the error code
    public int getErrorCode() {
        return code;
    }

        

    


}