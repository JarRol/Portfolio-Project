/* 
 *  Fleet.java
 *    Reads the FleetSpecs textfile and creates a fleet while handling exceptions
 *
 *  Name:Jared Rolon
 *  Date:4/5/2022
 *
 */
 
   import java.util.Scanner; 
   import java.util.ArrayList;
   import java.io.*;
 
 public class Fleet {
 public static void main(String[] args) throws IOException {
 
    //Variables
    Scanner input = new Scanner(System.in);
    String lineholder;
    String[] linesplitter;
    String filename;
    ArrayList<Ship> ships = new ArrayList<Ship>();
    boolean done = false;
    String testname;
    boolean namecheck = false;
    boolean check;
    int loadholder;
    int yearholder;
    int maxholder;
    Scanner readfile;
    
    //Loop to check for the file to be correct
    while (!done){
    
     try {
     System.out.print("Please enter the file name you would like to read: ");
     filename = input.nextLine();
     
     readfile = new Scanner(new File(filename));
     done = true;
     
    System.out.print("\n");
    //Loop to read file
    while (readfile.hasNext()) {
      
      lineholder = readfile.nextLine();
      linesplitter = lineholder.split("_");
      
      //Checks the keyword in the file to be one of the specified commands: CRUISE, CARGO, LOAD, UNLOAD, or CHANGENAME and processes the lines
      switch (linesplitter[0].toLowerCase()) {
      
      case "cruise":
            yearholder = Integer.parseInt(linesplitter[2]);
            maxholder = Integer.parseInt(linesplitter[3]);
            ships.add( new CruiseShip(linesplitter[1], yearholder, maxholder));
            break;
      case "cargo":
            yearholder = Integer.parseInt(linesplitter[2]);
            maxholder = Integer.parseInt(linesplitter[3]);
            ships.add( new CargoShip(linesplitter[1], yearholder, maxholder));
            break;
      case "load":
         try {
            for (int l = 0; l < (ships.size()); l++) {
            testname = ships.get(l).getName();
               if (testname.equals(linesplitter[1])) {
               loadholder = Integer.parseInt(linesplitter[2]);
               check = ships.get(l).load(loadholder);
               namecheck = true;
               }
            }
            
            if (!namecheck) {
            System.out.println("There was no ship named " + linesplitter[1]);
            }
           } catch (Exception e) {
             System.out.println("ERROR: " + e.getMessage());
           }
           namecheck = false;
            break;
      case "unload":
         try {
            for (int l = 0; l < (ships.size()); l++) {
            testname = ships.get(l).getName();
               if (testname.equals(linesplitter[1])) {
               loadholder = Integer.parseInt(linesplitter[2]);
               check = ships.get(l).unload(loadholder);
               namecheck = true;
               }
            }
            
            if (!namecheck) {
            System.out.println("There was no ship named " + linesplitter[1]);
            }
           } catch (Exception e) {
             System.out.println("ERROR: " + e.getMessage());
           }
           namecheck = false;
            break;
       case "changename":
             for (int l = 0; l < (ships.size()); l++) {
             testname = ships.get(l).getName();
             if (testname.equals(linesplitter[1])) {
               ships.get(l).changeName(linesplitter[2]);
               namecheck = true;
              }
             }
             if (!namecheck) {
            System.out.println("There was no ship named " + linesplitter[1]);
            }
            namecheck = false;
            break;
      default: 
            System.out.println("There was an error while reading the command: " + linesplitter[0]);
            break;    
     }
    }
    
    //Prints the array list for checking the tests done during the program
    System.out.println("");
    System.out.println("Ship Names                                          Year Current  Max");
    for (int l = 0; l < (ships.size()); l++) {
       System.out.println(ships.get(l));
    } 
    } catch (IOException e){
     System.out.println("The file you entered could not be found, try again");
     }
     catch (Exception e) {
     System.out.print("Error" + e.getMessage());
     }
    }
    
    
    System.exit(0);
   }
 }