/* 
 *  Bookstore.java
 *    Reads a texfile thats delimited by an underscore to get books for the book and inventory classes
 *
 *  Name:Jared Rolon
 *  Date:3/24/2022
 *
 */
   import java.util.Scanner;
   import java.io.*;
   
 public class Bookstore {
 public static void main(String[] args) throws IOException {
    
    //Variables
    String lineholder;
    String[] linesplitter;
    Scanner readfile = new Scanner(new File("inventory.txt"));
    Inventory stock = new Inventory();
    int editionholder;
    double priceholder;
    boolean check;
    
    //Reading and interpreting file to create the book list in inventory
    while (readfile.hasNext()) {
      
      lineholder = readfile.nextLine();
      linesplitter = lineholder.split("_");
      editionholder = Integer.parseInt(linesplitter[3]);
      priceholder = Double.parseDouble(linesplitter[5]);
      Book newbook = new Book(linesplitter[0],linesplitter[1],linesplitter[2],editionholder,linesplitter[4],priceholder);
      check = stock.addBook(newbook);
      
      if (check == false){
         System.out.print("An error has ocurred");
         System.exit(0);
         }
      }
      
         //Displays the books currently in the inventory
         stock.printInventory();
         
         //Runs changes to the inventory including a removal
         stock.changePrice("013478796X", 123456.78);
         stock.removeBook("0321409493");
        
         //Displays the inventory after the changes to the inventory were made
         System.out.print("\n \n");
         stock.printInventory();
        
         readfile.close();
         System.exit(0);
   }
 }