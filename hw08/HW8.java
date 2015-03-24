//Rebecca Holowienka
//CSE2
//March 24, 2015
//hw08
//HW8 Java Program
        //Purpose of this program is to: 
            /**You are designing a GAME! YES! The main method is provided as below. 
             * Please read it carefully and write the missing methods. Please do not 
             * change the main method.*/

//import scanner
import java.util.Scanner;

import java.util.Random;

    public class HW8{

        public static void main(String[] args) {
            char option;
        
            Scanner scan = new Scanner(System.in); //declare scanner
        
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc"); //ask user to decide if they want to continue or not
        
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//ask user to decide if they want to continue or not
        
            System.out.println("You walked and walked and walked and you saw a cave!");
            
            cave();
            
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//ask user to decide if they want to continue or not
        
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//ask user to decide if they want to continue or not
        
            System.out.println("Unfortunately, you ran into a GIANT!");
            
            giant();
            
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10); //ask user to decide if they want to attack or escape
        
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure boxes in front of you! Enter the box number you want to open!");
            
            box();
            
            input = getInput(scan);
        
            System.out.println("Hero! Have a good day!");
    }

public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

public static String getInput(Scanner scan, String string){
        
        if (!(scan.hasNext("["+string+"]"))) {
    		System.out.println("Yeah right LOSER!");
    		System.exit(0);
		}
    	scan.next();
    	return "";
    }
    
    public static String getInput(Scanner scan, String string, int trial){ 
    	
    	Random rand = new Random();
    	int Attack;
    	int Escape = 0;
    	int Hits = 0;
    	
    	while (Hits < trial && Escape != 10) {
    		if (!(scan.hasNext("["+string+"]"))) {
    			System.out.println("Executed by the GIANT! Game Over!");
    			System.exit(0);
    		} else {
    			if (scan.hasNext("[Aa]")) {
    				Attack = rand.nextInt(2);
    				if (Attack == 1) {
    					Hits++;
    					System.out.println("Critical hit!");
					} else {
						System.out.println("Gosh! How can you miss it!");
					}
    			} else if (scan.hasNext("[Ee]")) {
    				Escape = rand.nextInt(11);
    				if (Escape == 10) {
    					System.out.println("You sucessfully escaped!!");
					} else {
						System.out.println("Escape attempt failed - please try again [AaEe]:");
					}
				}
    		}
    		scan.next();
    	}
    	
    	return "";
    }
    
    public static String getInput(Scanner scan){
    	
    	if (scan.hasNextInt()) {
    		int box = scan.nextInt();
    		switch (box) {
				case 1: System.out.println("You get 1 million dollars! :)");
					break;
				
				case 2: System.out.println("You get a paid vacation!");
					break;
				
				case 3: System.out.println("You get a 4.0 GPA!");
					break;
				
				default: System.out.println("A wrong number! You get nothing! Better restart the game LOL");
					break;
			}
		} else {
			System.out.println("A wrong input!! You get nothing! Better restart the game LOL");
		}
    	
    	return "";
 
    	
//test/testtest
   } //end of main method
   
}  //end of class