//Rebecca Holowienka
//hw03
//February 9, 2015
//FourDigits Java Program

//Purpose of this program:
/**Enter a double and then print out the first four 
    digits to the right of the decimal point*/ 

// first compile the program
//      javac FourDigits.java
// run the program
//      java FourDigits//

// define a class
import java.util.Scanner;
public class FourDigits{
    
// add main method
 public static void main(String[] args) {
     
System.out.printf( %d 0 "Enter a double and display the four digits to the right of the decimal point: "); 
        //define what the user will be asked to enter
        
    Scanner myScanner = new Scanner(System.in); //define a Scanner
    double num = myScanner.nextDouble(); //collect integer
    
    int test = (int) (num);
    double digits = (num % test) * 10000;
    int digits2 = (int) digits;
System.out.println("The four digits are: " + digits2);
    
   //test/testtest
   
 } //end of main method
}  //end of class