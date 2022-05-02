/* 
 *  Validator.java
 *    Reads the acctNums textfile and ask the user for a 5 digit code and check the numbers given to see if that number exists within thr textfile
 *
 *  Name:Jared Rolon
 *  Date:4/21/2022
 *
 */
 
   import java.util.Scanner; 
   import java.util.ArrayList;
   import java.io.*;
 
 public class Validator {
 public static void main(String[] args) throws IOException {
 
    //Variables
    Scanner input = new Scanner(System.in);
    String filename;
    String lineholder;
    int check;
    int[] accountnums = new int[100];
    boolean filefound = false;
    boolean done = false;
    boolean inrange;
    Scanner readfile;
    long[] accountnumssorted;
    long[] accountcheck;
    
    //Loop to check for the file to be correct
    while (!filefound){
      try {
       System.out.print("Please enter the file name you would like to read: ");
       filename = input.nextLine();
     
       readfile = new Scanner(new File(filename));
       filefound = true;
       System.out.print("\n");
       
         for (int l = 0; l < (accountnums.length); l++) {

         lineholder = readfile.nextLine();
         accountnums[l] = Integer.parseInt(lineholder);
        
        }
        accountnumssorted = QuickSort.sort(accountnums);
        while (!done) {
        
         try {
            System.out.print("Please enter a 5 digit number or 0 to exit: ");
            check = Integer.parseInt(input.nextLine());
            inrange = InRange(check);
            
            if (check == 0 ){
             done = true;
             System.out.println("Goodbye");
            } else {
            if (inrange){
            accountcheck = BinarySearch.search(accountnums, check);
            if (accountcheck[0] >= 0) {
                System.out.println("The number " + check + " is a valid account number");
                System.out.println("");
            }  else {
               System.out.println("The number " + check + " is not a valid account number");
               System.out.println("");
            }
            }
           }
           
         } catch(NumberFormatException e){
           System.out.println("You must enter a Number");
         }
         catch(Exception e) {
           System.out.println("Error: " + e.getMessage());
         }
        }
      } catch (IOException e){
     System.out.println("The file you entered could not be found, try again");
     } catch (Exception e) {
     System.out.println("Error: " + e.getMessage());
     }
    }
 
   }
   public static boolean InRange (int num) {
        if (num == 0) {
        return true;
        } else {
        if(num >=10000 && num <=99999) {
        return true;
        } else {
        throw new RuntimeException("The number " + num + " was not in the range of 10000 and 99999");
        }
       }
   }
 }