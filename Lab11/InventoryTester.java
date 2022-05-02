/* 
 *  InventoryTester.java
 *    Tests the functionality of the Inventory and Book classes
 *
 *  Name:Jared Rolon
 *  Date:3/1/2022
 *
 */
 
   import java.util.Scanner; 
 
 public class InventoryTester {
 public static void main(String[] args) {
      
      Inventory stock = new Inventory(10);
      Book book1 = new Book("013478796X", "Tony Gaddis", "Starting Out With Java: From Control Structures through Data Structures", 4, "PE", 121.75);
      Book book2 = new Book("0321409493", "John Lewis", "Java Software Solutions: Foundations of Program Design", 5, "AW", 94.00);
      Book book3 = new Book("0134743350", "Harvey Deitel", "Java How to Program, Early Objects", 12, "PE", 134.84);
      Book book4 = new Book("002360692X", "Richard Johnsonbaugh", "Algorithms", 1, "PH", 109.00);
      Book book5 = new Book("1593276036", "Eric Matthes", "Python Crash Course", 1, "NS", 39.95);
      Book book6 = new Book("0143067889", "Ray Kurzweil", "The Singularity is Near", 1, "PG", 17.70);
      Book[] bookcollection = {book1, book2, book3, book4, book5, book6};
      boolean check = true;
      int counter = 0;
      
      
      do{
      
      check = stock.addBook(bookcollection[counter]);
      
      if (check){
         counter++;
         }else {
         System.out.print("An error has occured during the array transfer");
         }
       
      } while (counter < bookcollection.length);
      
      if (check){
         stock.printInventory();
         
         stock.changePrice("013478796X", 50.00);
         stock.changePrice("0143067889", 9.95);
         stock.changePrice("0134743350", 100.00);
         
        System.out.print("\n \n");
        stock.printInventory();
      }
   }
 }