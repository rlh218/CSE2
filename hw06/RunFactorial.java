//Rebecca Holowienka
//March 2, 2015
//CSE2
//HW06
//RunFactorial Java Program
    //Purpose of this program is to:
        /**Use while-loop to solve factorial programs. 
           Using scanner, you will first input an integer 
           that is between 9 and 16 inclusively. 
           Then you need to calculate the factorial of the input number.*/

// first compile the program
//      javac RunFactorial.java
// run the program
//      java RunFactorial//

//import scanner
import java.util.Scanner;

    //define a class
    public class RunFactorial{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

System.out.println("Enter an integer that is between 9 and 16 inclusively.");
    //asking user for input 
    double integer1 = myScanner.nextDouble();
    
    //if value for integer is outside of range, invalid entry
    //if value is not an int, invalid entry
    while(integer1 < 9 || integer1 > 16 || integer1 % 1 != 0){
        System.out.println("Invalid integer entered.");
        System.out.println("Please re-enter integer that is between 9 and 6 inclusively.");
            integer1 = myScanner.nextDouble();
    }

System.out.println("Input accepted:");
        //arithmetic loop to do factorial
        int factorial = 1;
        while(integer1>0){
            factorial*=integer1;
            integer1-=1;
        }
//print out the answer to the factorial        
System.out.println("The factorial is equal to " + factorial);

} //end of main method  
} // end of class
