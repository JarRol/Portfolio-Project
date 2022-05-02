/* 
 *  RoomAreas.java
 *    Uses the Rectangle class to calculate the area of 3 rooms
 *
 *  Name:Jared Rolon
 *  Date:2/22/2022
 *
 */
 
 import java.util.Scanner; 
 
  public class RoomAreas {
 public static void main(String[] args) {
      
      //Variables
      Rectangle kitchen = new Rectangle();
      Rectangle bedroom = new Rectangle();
      Rectangle livingroom = new Rectangle();
      Scanner input = new Scanner(System.in);
      double totalarea;
      
      //Gather the data
      System.out.print("Please enter the kitchens length:    ");
      kitchen.setLength(input.nextDouble());
      System.out.print("Please enter the kitchens width:     ");
      kitchen.setWidth(input.nextDouble());
      System.out.print("Please enter the bedroom length:     ");
      bedroom.setLength(input.nextDouble());
      System.out.print("Please enter the bedroom width:      ");
      bedroom.setWidth(input.nextDouble());
      System.out.print("Please enter the living room length: ");
      livingroom.setLength(input.nextDouble());
      System.out.print("Please enter the living room width:  ");
      livingroom.setWidth(input.nextDouble());
      
      //Calculate total area
      totalarea = (kitchen.getArea() + bedroom.getArea() + livingroom.getArea());
      
      //Display data
      System.out.printf("\nThe kitchen is %,.1f x %,.1f, with an area of %,.1f sq ft. \n", kitchen.getLength(), kitchen.getWidth(), kitchen.getArea());
      System.out.printf("The bedroom is %,.1f x %,.1f, with an area of %,.1f sq ft. \n", bedroom.getLength(), bedroom.getWidth(), bedroom.getArea());
      System.out.printf("The living room is %,.1f x %,.1f, with an area of %,.1f sq ft. \n", livingroom.getLength(), livingroom.getWidth(), livingroom.getArea());
      System.out.printf("\nThe total area of the three rooms is %,.1f sq ft. ", totalarea);
      
   }
 }