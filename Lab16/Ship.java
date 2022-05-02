/* 
 *  Ship.java
 *    The absract superclass that will be used to construct cargo and cruise ships.
 *
 *  Name:Jared Rolon
 *  Date:3/29/2022
 *
 */
 
 public abstract class Ship {
   private String shipname;
   private int yearbuilt;
   
   public Ship (String name, int year) {
      shipname = name;
      yearbuilt = year;
   } 
   
   public int getYearBuilt() {
      return yearbuilt;
   }
   
   public String getName() {
      return shipname;
   }
   
   public void changeName (String newname) {
      shipname = newname;
   }
   
   public boolean equals ( Ship othership) {
      if (this.shipname.equals(othership.getName())) {
         if (this.yearbuilt == othership.getYearBuilt()){
         return true;
         } else {
         return false;
         }
      } else {
        return false;
      }
   }
   
   public String toString() {
   String formatted;
   formatted = String.format("%-50.50s  %4d", shipname, yearbuilt);
   return formatted;
   }
   
   public abstract boolean load (int num);
   
   public abstract boolean unload (int num);
 }