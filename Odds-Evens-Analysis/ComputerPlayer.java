/**
 * This class represents a computer
 * player in the Odd-Even game
 * Satchel Moore (scm2206)
 *  5 March 2022
 */



public class ComputerPlayer{
    private double t;
    private int tokenBalance;
    public int computerInput;
    private double t1;
    private double t2;
    public int compOneInput;
    public int compTwoInput;
    
    public ComputerPlayer(double threshold){
        t=threshold;
        tokenBalance=0;
        computerInput = 1;
        t1 = threshold;
        t2 = threshold;
        compOneInput = 0;
        compTwoInput = 0;
    }
    
    // computer method for the interactive game
    public void compPlay() {

    
    int computerScore = 0;
    double randomNum = Math.random();
    
    
    if (randomNum > t) {
        computerInput = 2;

    } else if (randomNum < t) {
        computerInput = 1;
    } else {
        ;}
 
    System.out.println("Computer chose " + computerInput);
    
    
    
    }

    // computer method for computer v. computer game

    public void compPlaySim() {

    
    int computerScore = 0;
    double randomNum1 = Math.random();
    double randomNum2 = Math.random();
    
    
    if (randomNum1 > t1) {
        compOneInput = 2;

    } else if (randomNum1 < t) {
        compOneInput = 1;
    } else {
        ;}

    if (randomNum2 > t) {
        compTwoInput = 2;

    } else if (randomNum2 < t) {
        compTwoInput = 1;
    } else {
        ;}
 
    
    
    
    
    }

  
    
}