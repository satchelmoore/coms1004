/**
 * This class should run simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not who has the advantage and what is a strategy
 * that will realize that adavantage.
 * 
 * 
 */


public class Simulation{
    
    public static void main(String[] args){

        double firstThreshold;
        double secondThreshold;


        // loops through every possible pairing of thresholds & simulates game


        for (secondThreshold = 0.0; secondThreshold <= 1.0; 
        secondThreshold = secondThreshold + 0.05) {

            firstThreshold = 0.0;
            while (firstThreshold <= 1.0) {
                Game gsim = new Game(firstThreshold, secondThreshold);
                gsim.play(100000);

                System.out.println("P1 threshold: " + firstThreshold);
                System.out.println("P2 threshold: " + secondThreshold);
                System.out.println("P1 score: " + gsim.getP1Score());
                System.out.println("P2 score: " + gsim.getP2Score());
                System.out.println("*******************************");

                firstThreshold = firstThreshold + 0.05;
            }



        }
    



        
    }
}