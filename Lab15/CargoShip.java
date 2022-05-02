/* 
 *  CargoShip.java
 *    The subclass that handles the fields and methods of a cargo ship
 *
 *  Name:Jared Rolon
 *  Date:3/29/2022
 *
 */
 
 public class CargoShip extends Ship {
   
   private int maxcargo;
   private int currentcargo;
   
   public CargoShip ( String name, int year, int maxp) {
      super(name, year);
      maxcargo = maxp;
      currentcargo = 0;
   }
   
   public CargoShip (CargoShip othership) {
      super(othership.getName(), othership.getYearBuilt());
      maxcargo = othership.getMaxCargo();
      currentcargo = othership.getCurrentCargo();
   }
   
   public int getCurrentCargo() {
      return currentcargo;
   }
   
   public int getMaxCargo() {
      return maxcargo;
   }
   
   public boolean load (int num) {
      
      int change = num + currentcargo;
      if (change <= maxcargo) {
         currentcargo += num;
         return true;
      } else {
        return false;
      }
   }
   
   public boolean unload (int num) {
   
      int change = currentcargo - num;
      if (num > maxcargo) {
         return false;
      } else {
        if (change >= 0) {
        currentcargo -= num;
        return true;
        } else {
          return false;
        }
      }
   }
   
    public String toString() {
    String formatted;
    formatted = String.format("%s  %6d  (%6d)",super.toString(), currentcargo, maxcargo);
    return formatted;
    }
 }