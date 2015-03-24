//Rebecca Holowienka
//CSE2
//March 23, 2015
//Lab 07
//ZigZag Java Program
        //Purpose of this program is to: 
            /**
            1. Create an int variable nStars and assign it the value of 10. 
                Then, use a loop to print out nStars copies of ‘*’ on a line: **********
            2. Nest a loop similar to the above in a second loop so that your program prints out the following:
                    *
                     *
                      *
                       *
                        *
                         *
                          *
                           *
                            *
                             *
            3. Repeat #1 → Create an int variable nStarts
            4. Import java.util.Scanner. Then write a loop(s) that appear above the loops you wrote above and 
                forces the user to enter an int between 3 and 33, storing the int in nStars. (Recall the Scanner method 
                hasNextInt(). Your loop(s) will be controlled by two boolean conditions, hasNextInt() and the 
                value of nextInt() being in the range 3-33, inclusive.) Below is a sample run of the program and 
                below that some comments that provide a framework for writing the code.
            5. Wrap all the code in an infinite loop (headed by while(true)). At the bottom of the loop ask the user 
                whether to continue. If the user enters anything but “Y” or “y” execute a break to leave the loop. */

//import scanner
import java.util.Scanner;

    //define a class
     public class zigzag{
         
        //define a main method
         public static void main(String[] args) {
    	
    	while (true) { //start while loop
		
    	Scanner scan = new Scanner(System.in);
    	
    	int numStars = 0;
    	
    	boolean goodInput = false;
    	
    	System.out.print("Enter an int between 3 and 33: ");
    	
    	while(goodInput == false) { //start while loop
    		if (scan.hasNextInt()) {
				numStars = scan.nextInt();
				if (numStars > 2 && numStars < 34) {
					goodInput = true;
				}//end of nested if statement 
				else {
					System.out.println("Invalid Input - Not beteen 3 and 33");
				}//end of nested else statement
			} //end of if statement
			else {
				System.out.println("Invalid Input - Not an integer");
				scan.next();
			}//end of else statement
    	}//end of while loop
    	
    	for (int i = 0; i < numStars-1; i++) {
			System.out.print("*");
		}//end of for loop
    	
    	for (int i = 0; i < numStars-1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}//end of nested for loop
			System.out.print("*");
			System.out.println(" ");
		}//end of for loop
    	
    	for (int i = 0; i < numStars; i++) {
			System.out.print("*");
		}//end of for loop
    	
    	System.out.println("");//print space
    	System.out.print("Enter Y or y to go again, or n to exit program: ");
    	
    	String response = scan.next();
    	char letter = response.charAt(0);
    	
    	if(!(letter == 'y') && !(letter == 'Y')) {
    		break;
    	}//end of if statement
    	
    	System.out.println("");
    	}
    	
//testtest

    }//end of main method
    
}//end of class

