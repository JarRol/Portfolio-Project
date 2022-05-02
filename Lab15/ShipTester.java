/* 
 *  ShipTester.java
 *    Tests the functionality of the Ship, CruiseShip, and CargoShip classes
 *
 *  Name:Jared Rolon
 *  Date:3/29/2022
 *
 */
 
   import java.util.Scanner; 
   import java.util.ArrayList;
 
 public class ShipTester {
 public static void main(String[] args) {
 
      ArrayList<Ship> ships = new ArrayList<Ship>();
      boolean check;
      
      ships.add( new CruiseShip("Boaty Mcboat", 1988, 500000));
      ships.add( new CruiseShip("Macboat", 1999, 800000));
      ships.add(ships.get(0));
      ships.add( new CargoShip("Hauler Bros", 1956, 400000));
      ships.add( new CargoShip("Freight Train", 1994, 700000));
      ships.add(ships.get(3));
      
      System.out.println("Ship Names                                          Year Current  Max");
      for (int l = 0; l < (ships.size()); l++) {
       System.out.println(ships.get(l));
    }
   System.out.print("\n");
   
   System.out.println("Loads and unloads Testing");
   check = ships.get(0).load(250000);
   
   if (check) {
      System.out.println("The Load was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(0).load(260000);
   
   if (check) {
      System.out.println("The Load was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(3).load(200000);
   
   if (check) {
      System.out.println("The Load was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(3).load(210000);
   
   if (check) {
      System.out.println("The Load was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(0).unload(200000);
   
   if (check) {
      System.out.println("The Unload was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(1).unload(400000);
   
   if (check) {
      System.out.println("The Unload was a success");
   } else {
     System.out.println("An error has occurred");
   }
 
    check = ships.get(3).unload(100000);
   
   if (check) {
      System.out.println("The Unload was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   check = ships.get(4).unload(400000);
   
   if (check) {
      System.out.println("The Unload was a success");
   } else {
     System.out.println("An error has occurred");
   }
   
   System.out.print("\n");
   System.out.println("Equals Testing");
   
   check = ships.get(0).equals(ships.get(1));
   if (check) {
      System.out.println("These ships are the same");
   } else {
     System.out.println("These ships are not the same");
   }
   
   check = ships.get(0).equals(ships.get(2));
   if (check) {
      System.out.println("These ships are the same");
   } else {
     System.out.println("These ships are not the same");
   }
   
   check = ships.get(3).equals(ships.get(4));
   if (check) {
      System.out.println("These ships are the same");
   } else {
     System.out.println("These ships are not the same");
   }
   check = ships.get(3).equals(ships.get(5));
   if (check) {
      System.out.println("These ships are the same");
   } else {
     System.out.println("These ships are not the same");
   }
   
   System.out.print("\n");
   System.out.println("Ship Names                                          Year Current  Max");
      for (int l = 0; l < (ships.size()); l++) {
       System.out.println(ships.get(l));
    }
    
 }
}