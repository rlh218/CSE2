//Rebecca Holowienka
//CSE2
//March 2, 2015
//HW06
//GetIntegers Java Program
        //Purpose of this program is to: 
            /** Ask the user for 5 non-negative integers 
                (if an invalid value is entered, then ask again, using a loop), 
                and print out the sum of the 5 integers. Please write the 
                program using non-nested for-loops. */
                
// first compile the program
//      javac GetIntegers.java
// run the program
//      java GetIntegers//

//import scanner
import java.util.Scanner;

    //define a class
    public class GetIntegers{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

System.out.println("Please enter 5 non-negative integers: ");
//asking user to input values for the five integers
int value1 = myScanner.nextInt();
int value2 = myScanner.nextInt();
int value3 = myScanner.nextInt();
int value4 = myScanner.nextInt();
int value5 = myScanner.nextInt();

//using a while loop to say if the values are negative to ask user to re-enter values.
while(value1 < 0 || value2 < 0 || value3 < 0 || value4 < 0 || value5 < 0){
    System.out.println("Invalid integers entered.");
    System.out.println("Please re-enter 5 non-negative integers.");
        value1 = myScanner.nextInt();
        value2 = myScanner.nextInt();
        value3 = myScanner.nextInt();
        value4 = myScanner.nextInt();
        value5 = myScanner.nextInt();
    }
//printing out the sum of the five integers you entered 
System.out.println("Sum is " + (value1+value2+value3+value4+value5));
 
    
} // end of main method
} // end of class
