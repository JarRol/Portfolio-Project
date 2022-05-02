/* 
 *  CruiseShip.java
 *    The subclass that handles the fields and methods of a cruise ship
 *
 *  Name:Jared Rolon
 *  Date:3/29/2022
 *
 */
 
 public class CruiseShip extends Ship {
   
   private int maxpassengers;
   private int currentpassengers;
   
   public CruiseShip ( String name, int year, int maxp) {
      super(name, year);
      maxpassengers = maxp;
      currentpassengers = 0;
   }
   
   public CruiseShip (CruiseShip othership) {
      super(othership.getName(), othership.getYearBuilt());
      maxpassengers = othership.getMaxPassengers();
      currentpassengers = othership.getCurrentPassengers();
   }
   
   public int getCurrentPassengers() {
      return currentpassengers;
   }
   
   public int getMaxPassengers() {
      return maxpassengers;
   }
   
   public boolean load (int num) {
      
      int change = num + currentpassengers;
      if (change <= maxpassengers) {
         currentpassengers += num;
         return true;
      } else {
        throw new RuntimeException("The load could not complete as the addition of " + num + " passengers exceeds the max of " + maxpassengers + " passengers when combined with the current amount of " + currentpassengers + " passenegrs" );
      }
   }
   
   public boolean unload (int num) {
   
      int change = currentpassengers - num;
      if (num > maxpassengers) {
        throw new RuntimeException(num + " passengers exceeds the maximum capacity of " + maxpassengers + " passengers");
      } else {
        if (change >= 0) {
        currentpassengers -= num;
        return true;
        } else {
        throw new RuntimeException("The unload could not complete as the unloading of " + num + " passengers would be more then the current number of boarded passengers, which is " + currentpassengers );
        }
      }
   }
   
    public String toString() {
    String formatted;
    formatted = String.format("%s  %6d  (%6d)",super.toString(), currentpassengers, maxpassengers);
    return formatted;
    }
 }