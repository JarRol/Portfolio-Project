/* 
 *  LineNumbers.java
 *   Tracking the amount of lines in a specified .txt file and displaying line numbers
 *   in a different output file alongside the text
 *  Name:Jared Rolon
 *  Date:2/10/2022
 *
 */
 
  import java.util.Scanner;
  import java.io.*;
  import javax.swing.JOptionPane; 

public class LineNumbers {
 public static void main(String[] args) throws IOException {
 
      //Variables
      String filename;
      String outputname;
      int counter = 1;
      String lineholder;
      
      //Get the names for the Input and Output textfiles
      filename = JOptionPane.showInputDialog("Enter the name of the file that you would like to be read");
      outputname = JOptionPane.showInputDialog("Enter the name of the output file");
      
      //Create the printwriter and scanner
      Scanner readfile = new Scanner(new File(filename));
      PrintWriter outputfile = new PrintWriter(outputname);
      
      //Read the lines, print them with line numbers
      while (readfile.hasNext()) {
      
      lineholder = readfile.nextLine();
      outputfile.printf("%5d. %s\n", counter, lineholder);
      counter++;
      
      }
      
      //Display confirmation message and close everything that was open
      JOptionPane.showMessageDialog(null, "Have a good day");
      readfile.close();
      outputfile.close();
      System.exit(0);
   }
 }