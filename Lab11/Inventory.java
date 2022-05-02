/* 
 *  Inventory.java
 *    Holds the Inventory class that creates an array of book classes
 *
 *  Name:Jared Rolon
 *  Date:3/1/2022
 *
 */
 
 import java.util.Scanner; 
 
  public class Inventory {
  
  //Fields
  private Book[] books;
  private int nextentry;
  
  public Inventory(int size) {
  
     books = new Book[size];
     nextentry = 0;   
   }
   
  public boolean addBook( Book newbook) {
  
     if (nextentry < books.length) {
         books[nextentry] = newbook;
         nextentry++;
         return true;
     } else {
         return false;
       }
   }
   
  public void changePrice(String isbn, double  newprice){
      
      for (int i = 0; i < nextentry; i++) {
 
         if (isbn.equals(books[i].getISBN())){
           books[i].changePrice(newprice);
         }
      }
      
   }
  public void printInventory() {
  System.out.printf("ISBN       AUTHOR              ED  PUB   PRICE    TITLE");
  for (int l = 0; l < nextentry; l++) {
       System.out.printf("\n%10s %-20s %-3d %-2s   $%,-7.2f %-50s", books[l].getISBN(), books[l].getAuthor(), books[l].getEdition(), books[l].getPubCode(), books[l].getPrice(), books[l].getTitle());
    }
   }
  }