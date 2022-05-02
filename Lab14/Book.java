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
//Checks if the isbn is correct based on the isbn-10 check digit
public boolean isValidISBN() {

   char[] firstcheck = codenumber.toCharArray();
   int secondcheck;
   
   if (firstcheck[9] == 'X') {
    int isbnnumber1 = Integer.parseInt(Character.toString(firstcheck[0]));
    int isbnnumber2 = Integer.parseInt(Character.toString(firstcheck[1]));
    int isbnnumber3 = Integer.parseInt(Character.toString(firstcheck[2]));
    int isbnnumber4 = Integer.parseInt(Character.toString(firstcheck[3]));
    int isbnnumber5 = Integer.parseInt(Character.toString(firstcheck[4]));
    int isbnnumber6 = Integer.parseInt(Character.toString(firstcheck[5]));
    int isbnnumber7 = Integer.parseInt(Character.toString(firstcheck[6]));
    int isbnnumber8 = Integer.parseInt(Character.toString(firstcheck[7]));
    int isbnnumber9 = Integer.parseInt(Character.toString(firstcheck[8]));
    int isbnnumber10 = 10;
    
    secondcheck = ((isbnnumber1 * 1) + (isbnnumber2 * 2) + (isbnnumber3 * 3) + (isbnnumber4 * 4) + (isbnnumber5 * 5) + (isbnnumber6 * 6) + (isbnnumber7 * 7) + (isbnnumber8 * 8) + (isbnnumber9 * 9) + (isbnnumber10 * 10)) % 11;
    if (secondcheck == 0) {
     return true;
     } else {
     return false;
     }
    } else {
    int isbnnumber1 = Integer.parseInt(Character.toString(firstcheck[0]));
    int isbnnumber2 = Integer.parseInt(Character.toString(firstcheck[1]));
    int isbnnumber3 = Integer.parseInt(Character.toString(firstcheck[2]));
    int isbnnumber4 = Integer.parseInt(Character.toString(firstcheck[3]));
    int isbnnumber5 = Integer.parseInt(Character.toString(firstcheck[4]));
    int isbnnumber6 = Integer.parseInt(Character.toString(firstcheck[5]));
    int isbnnumber7 = Integer.parseInt(Character.toString(firstcheck[6]));
    int isbnnumber8 = Integer.parseInt(Character.toString(firstcheck[7]));
    int isbnnumber9 = Integer.parseInt(Character.toString(firstcheck[8]));
    int isbnnumber10 = Integer.parseInt(Character.toString(firstcheck[9]));
    
    secondcheck = ((isbnnumber1 * 1) + (isbnnumber2 * 2) + (isbnnumber3 * 3) + (isbnnumber4 * 4) + (isbnnumber5 * 5) + (isbnnumber6 * 6) + (isbnnumber7 * 7) + (isbnnumber8 * 8) + (isbnnumber9 * 9) + (isbnnumber10 * 10)) % 11;
    if (secondcheck == 0) {
     return true;
     } else {
     return false;
     }
    }
   }
//Displays the info for each field to be displayed
public String toString() {
   String formatted;
   boolean check = this.isValidISBN();
   if (check){
      formatted = String.format("%-10s   %-20.20s %2d  %2s   $%,10.2f %-50.50s", codenumber, author, edition, pubcode, price, title);
    } else {
      formatted = String.format("%-10s*  %-20.20s %2d  %2s   $%,10.2f %-50.50s", codenumber, author, edition, pubcode, price, title);
    }
   return formatted;
   }
}