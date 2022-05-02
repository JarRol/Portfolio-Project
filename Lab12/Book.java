/* 
 *  Book.java
 *    Holds the Book class for use in future labs, with a constructor
 *
 *  Name:Jared Rolon
 *  Date:2/24/2022
 *
 */
 
 public class Book {
 
 //Fields
 private String codenumber;
 private String author;
 private String title;
 private int edition;
 private String pubcode;
 private double price;
 
 //Constructor
 public Book (String cn, String a, String t, int e, String pc, double pr) {
 codenumber = cn;
 author = a;
 title = t;
 edition = e;
 pubcode = pc;
 price = pr;
}

//Returns a books title
public String getTitle() {
      return title;
   }
//Returns the author of a book
public String getAuthor() {
      return author;
   }
//Returns the ISBN of a book
public String getISBN() {
      return codenumber;
   }
//Returns the publisher code of a book
public String getPubCode() {
      return pubcode;
   }
//Returns the edition of a book
public int getEdition() {
      return edition;
   }
//Returns the price of a book
public double getPrice() {
      return price;
   }
//Takes a new price for a book and replaces the value
public void changePrice(double newprice) {
   price = newprice;
   }
//Displays the info for each field to be displayed
public String toString() {
   String formatted;
   formatted = String.format("%10s %-20.20s %2d  %2s   $%,7.2f %-50.80s", codenumber, author, edition, pubcode, price, title);
   return formatted;
   }
}