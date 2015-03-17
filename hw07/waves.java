//Rebecca Holowienka
//CSE2
//March 17, 2015
//HW07
//NumberWaves Java Program
        //Purpose of this program is to: 
            /** Write a program that forces the user to 
            enter an integer between 1 and 30, inclusive, and 
            then prints out displays that depend on the value entered 
            that looks like this:
            For loop:
            1
            2
            22
            333
            33
            3
            While loop:
            1
            2
            22
            333
            33
            3
            Do-while loop:
            1
            2
            22
            333
            33
            3*/
                
// first compile the program
//      javac waves.java
// run the program
//      java waves//

//import scanner
import java.util.Scanner;

    //define a class
    public class waves{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
    	
		Scanner myScanner = new Scanner(System.in);

System.out.print("Enter a number between 1 and 30 inclusively: ");
		
		boolean Input1 = false;
		int input = 0;
		
		while (Input1 == false) {
			if (myScanner.hasNextInt()) {
				input = myScanner.nextInt();
				if (input < 1 || input > 30) {
					System.out.println("Invalid integer value entered.");
				} else {
					Input1 = true;
				}
			} else {
				System.out.println("Invalid integer value entered.");
				myScanner.next();
			}
			
		}
		System.out.println("");

System.out.println("For loop:");
		
		for (int x = 1; x < (input+1); x++) {
			if (x % 2 == 0) {
				for (int y = 0; y < x; y++) {
					for (int y2 = 0; y2 < y+1; y2++) {
						System.out.print(x);						
					}
					System.out.println("");
				}
			} else {
				int a = x;
				for (int y = 0; y < x; y++) {
					for (int y2 = a; y2 > 0; y2--) {
						System.out.print(x);
					}
					a--;
					System.out.println("");
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("While loop:");
		
		int x = 1;
		int y = 0;
		int z = 0;
		while (!(x == input+1)) {
			if(x % 2 == 0) {
				y = 0;
				while (!(y == x)) {
					z = 0;
					while (!(z == y+1)) {
						System.out.print(x);
						z++;
					}
					System.out.println("");
					y++;
				}
			} else {
				int a = x;
				y = 0;
				while (!(y == x)) {
					z = x-y;
					while (!(z == 0)) {
						System.out.print(x);
						z--;
					}
					System.out.println("");
					y++;
				}
			}
			x++;
		}
		
		System.out.println("");
		
		System.out.println("Do-while loop:");
		
		x = 1;
		y = 0;
		z = 0;
		do {
			if (x % 2 == 0) {
				y = 0;
				do {
					z = 0;
					do {
						System.out.print(x);
						z++;
					} while (!(z == y+1));
					System.out.println("");
					y++;
				} while (!(y == x));
			} else {
				int a = x;
				y = 0;
				do {
					z = x-y;
					do {
						System.out.print(x);
						z--;
					} while (!(z == 0));
					System.out.println("");
					y++;
				} while (!(y == x));
			}
			x++;
		} while (!(x == input+1));
		
		
} // end of main method
} // end of class