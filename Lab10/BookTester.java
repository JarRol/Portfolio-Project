/* 
 *  BookTester.java
 *    Tests the Book class and displays the resutlts
 *
 *  Name:Jared Rolon
 *  Date:2/24/2022
 *
 */
 
  import java.util.Scanner; 
 
 public class BookTester {
 public static void main(String[] args) {
 
      //Variables
      Book book1 = new Book("013478796X", "Tony Gaddis", "Starting Out With Java: From Control Structures to Data Structures", 4, "PE", 121.75);
      Book book2 = new Book("0321409493", "John Lewis", "Java Software Solutions: Foundations of Program Design", 5, "AW", 94.00);
      Book book3 = new Book( "0134743350", "Harvey Deitel", "Java How to Program, Early Objects", 12, "PE", 134.84);
      double newprice1 = 100.00;
      double newprice2 = 88.34;
      double newprice3 = 112.75;
      
      //Showing the data from each instance of book
      System.out.printf("ISBN: %s Author: %s   Edition: %d  Publisher Code: %s Price: $%,.2f Title: %s", book1.getISBN(), book1.getAuthor(), book1.getEdition(), book1.getPubCode(), book1.getPrice(), book1.getTitle());
      System.out.printf("\nISBN: %s Author: %s    Edition: %d  Publisher Code: %s Price: $%,.2f  Title: %s", book2.getISBN(), book2.getAuthor(), book2.getEdition(), book2.getPubCode(), book2.getPrice(), book2.getTitle());
      System.out.printf("\nISBN: %s Author: %s Edition: %d Publisher Code: %s Price: $%,.2f Title: %s", book3.getISBN(), book3.getAuthor(), book3.getEdition(), book3.getPubCode(), book3.getPrice(), book3.getTitle());
      

      //Letting them know the price changes
      System.out.printf("\n\n The price of Book1 changed from $%,.2f to $%,.2f", book1.getPrice(), newprice1);
      System.out.printf("\n The price of Book2 changed from $%,.2f  to $%,.2f", book2.getPrice(), newprice2);
      System.out.printf("\n The price of Book3 changed from $%,.2f to $%,.2f", book3.getPrice(), newprice3);
      
      //Changing the price
      book1.changePrice(newprice1);
      book2.changePrice(newprice2);
      book3.changePrice(newprice3);
      
      //Display with new price
      System.out.printf("\n\nISBN: %s Author: %s   Edition: %d  Publisher Code: %s Price: $%,.2f Title: %s", book1.getISBN(), book1.getAuthor(), book1.getEdition(), book1.getPubCode(), book1.getPrice(), book1.getTitle());
      System.out.printf("\nISBN: %s Author: %s    Edition: %d  Publisher Code: %s Price: $%,.2f  Title: %s", book2.getISBN(), book2.getAuthor(), book2.getEdition(), book2.getPubCode(), book2.getPrice(), book2.getTitle());
      System.out.printf("\nISBN: %s Author: %s Edition: %d Publisher Code: %s Price: $%,.2f Title: %s", book3.getISBN(), book3.getAuthor(), book3.getEdition(), book3.getPubCode(), book3.getPrice(), book3.getTitle()); 
     }
 }