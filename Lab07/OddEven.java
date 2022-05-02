/* 
 *  OddEven.java
 *   Creating a bunch of random numbers then checking how many are even and odd
 *
 *  Name:Jared Rolon
 *  Date:2/15/2022
 *
 */
 
  import javax.swing.JOptionPane;
  import java.util.Random;

 public class OddEven {
 public static void main(String[] args) {
 
       //Variables
       int randomnum;
       boolean iseven;
       int even = 0;
       int odd = 0;
       Random random = new Random();
       
       //Creates a random number, checks if its even or odd, then adds to a counter
       for (int f = 0; f < 1000; f++) {
       randomnum = random.nextInt(101);
       iseven = isEven(randomnum);
       if (iseven) {
       even++;
       } else {
       odd++;
       }

       }
       
       //Deliver results in a dialog box
       JOptionPane.showMessageDialog(null,"Out of 1,000 random numbers: \n" + "   The amount of even numbers was: " + even + "\n   The amount of odd numbers was: " + odd);
       System.exit(0);
   }
   //Checks the number sent to see if it is even or odd and returns a boolean
   public static boolean isEven (int number) {
   
   if ((number % 2) == 0) {
   return true;
   } else {
   return false;
   }
   
   }
 }