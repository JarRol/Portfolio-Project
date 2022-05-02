/* 
 *  Inventory.java
 *    Holds the Inventory class that creates an array of book classes
 *
 *  Name:Jared Rolon
 *  Date:3/1/2022
 *  ChangeLog Date: 3/22/2022
 *  Changed the Array to an array list as well as added the removeBooks method
 */
 
 import java.util.Scanner; 
 import java.util.ArrayList;
 
  public class Inventory {
  
  //Fields
  private ArrayList<Book> books;
 
  //Constructor
  public Inventory() {
  
     books = new ArrayList<Book>();
   
   }
   
   //Adds a book to the Arraylist
  public boolean addBook( Book newbook) {
  
     books.add(newbook);
     return true;
   }
   
   //Changes the price of a specified book by isbn
  public void changePrice(String isbn, double  newprice){
      
      for (int i = 0; i < (books.size()); i++) {
 
         if (isbn.equals(books.get(i).getISBN())){
           books.get(i).changePrice(newprice);
         }
      }
      
   }
   
   //Removes a book from the Arraylist by isbn
  public void removeBook(String isbn) {
  
  for (int r = 0; r < (books.size()); r++) {
 
         if (isbn.equals(books.get(r).getISBN())){
           books.remove(r);
         }
      }
  
  }
  
  //Displays the current information of the books in the ArrayList
  public void printInventory() {
  System.out.println("ISBN         AUTHOR               ED PUB         PRICE TITLE");
  for (int l = 0; l < (books.size()); l++) {
       System.out.println(books.get(l));
    }
   }
  }