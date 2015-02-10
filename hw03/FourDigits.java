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
     
System.out.printf( "Enter a double and display the four digits to the right of the decimal point: "); 
        //define what the user will be asked to enter
        
    Scanner myScanner = new Scanner(System.in); //define a Scanner
    double num = myScanner.nextDouble(); //collect integer
    
    int x = (int) num ;
    double y = num - x ;
    int digits = (int) (y*10000);
    int value1 = (int)(digits/1000)%10;
    int value2 = (int)(digits/100)%10;
    int value3 = (int)(digits/10)%10;
    int value4 = (int)digits%10;
    
System.out.println("The four digits are: " + value1+value2+value3+value4);
   //test/testtest
   
 } //end of main method
}  //end of class