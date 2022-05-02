/* 
 *  Rectangle.java
 *    Holds the Rectangle class to be used by RoomAreas
 *
 *  Name:Jared Rolon
 *  Date:2/22/2022
 *
 */
 
public class Rectangle {
   private double length;
   private double width;
   
   //Mutator for Length
   public void setLength(double roomlength) {
      length = roomlength;
   }
   
   //Mutator for Width
   public void setWidth(double roomwidth) {
      width = roomwidth;
   }
   
   // Sends the Length back to main
   public double getLength() {
      return length;
   }
   
   // Sends the Width back to main
   public double getWidth() {
      return width;
   }
   
   //Calculates Area and returns it
   public double getArea() {
      double area;
      
      area = length * width;
      
      return area;
   }
}