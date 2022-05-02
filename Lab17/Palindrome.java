/* 
 *  Palindrome.java
 *    Takes in a string input and checks to see if the string is a palindrome using recursion
 *
 *  Name:Jared Rolon
 *  Date:4/12/2022
 *
 */
 
   import java.util.Scanner; 
   import javax.swing.JOptionPane;
   
public class Palindrome {
public static void main(String[] args) {
   
   //Variables
   Scanner input = new Scanner(System.in);
   String palindrome;
   String palindromeremovedcharacters;
   String palindromelower;
   boolean palindromecheck;
   boolean keepgoing = true;
   int restart;
   
   while (keepgoing) {
   //Get word/phrase then remove anything nonalphabetical and lowercase
   System.out.print("Enter a word/phrase to be checked ");
   palindrome = input.nextLine();
   palindromeremovedcharacters = palindrome.replaceAll("[^A-Za-z]","");
   palindromelower = palindromeremovedcharacters.toLowerCase();
   
   //send to be checked
   palindromecheck = IsPalindrome(palindromelower);
   
   //Check the boolean
   if (palindromecheck) {
      System.out.println();
      System.out.print("The word/phrase " + palindrome + " IS a palindrome");
      }  else {
         System.out.println();
         System.out.println("The word/phrase " + palindrome + " IS NOT a palindrome");
      }
      
      //Ask if they want another item priced
      restart = JOptionPane.showConfirmDialog(null, "Would you like to check another item", "Again?", JOptionPane.YES_NO_OPTION);
        
      //Check if the program restarts
      if (restart == 1) {
      keepgoing = false;
         }
       
      }
      System.exit(0);
   }
   public static boolean IsPalindrome(String word) {
   
      int wordlength = word.length();
      char firstletter;
      char lastletter;
      boolean doitagain;
      String cutup;
      
      if (wordlength <= 1) {
         return true;
      }  else {
         firstletter = word.charAt(0);
         lastletter = word.charAt(wordlength - 1);
         
         if (firstletter == lastletter) {
            cutup = word.substring(1, wordlength - 1);
            return IsPalindrome(cutup);
         }  else {
            return false;
         }
      }
      
      
   }
}