/* 
 *  PrimeFactorial.java
 *   Generates a random number and checks if it's prime, and if it is, find its factorial
 *
 *  Name:Jared Rolon
 *  Date:2/17/2022
 *
 */
 
  import javax.swing.JOptionPane;
  import java.util.Random;

 public class PrimeFactorial {
 public static void main(String[] args) {
     
       //Variables
       int randomnum;
       boolean isprime;
       double factorial;
       Random random = new Random();
       boolean keepgoing = true;
       int restart;
       
       //Gets the random number checks if its prime, then eeither calculates factorial and displays that or just displays number
       do {
       
       randomnum = random.nextInt(51);
       isprime = isPrime(randomnum);
       
         if (isprime) {
         factorial = factorialCalculator(randomnum);
         
         //Display output with factorial
         JOptionPane.showMessageDialog(null, String.format("The number was %d and is prime \nThe factorial of this number is %,.0f",randomnum, factorial));
         
         //Ask if they want to try another number
         restart = JOptionPane.showConfirmDialog(null, "Would you like to roll another number", "Another Number?", JOptionPane.YES_NO_OPTION);
         
         //Check if the program restarts
            if (restart == 1) {
            keepgoing = false;
            }
         } else {
           //Display output without factorial
           JOptionPane.showMessageDialog(null, String.format("The number was %d and is not prime ",randomnum));
           
           //Ask if they want to try another number
           restart = JOptionPane.showConfirmDialog(null, "Would you like to roll another number", "Another Number?", JOptionPane.YES_NO_OPTION);
         
           //Check if the program restarts
            if (restart == 1) {
            keepgoing = false;
            }
           }
       } while (keepgoing);
      JOptionPane.showMessageDialog(null, "Have a good day");
      System.exit(0);
 }
 //Method to check if a number is prime
   public static boolean isPrime (int num) {
     int modulasnum;
     
     for (int i = 2; i < num; i++) {
     
     modulasnum = num % i;
     
      if (modulasnum == 0) {
       return false;
      }
     }
      return true;
   }
//Calculates a prime numbers factorial
   public static double factorialCalculator (int number) {
    double factorialcalc = 1;
    
    for (double t = 1; t <= number; t ++) {
    factorialcalc *= t;
    }
    return factorialcalc;
   }
 }