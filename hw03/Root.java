//Rebecca Holowienka
//hw03
//February 9, 2015
//Root Java Program

//Purpose of this program:
//Prompt the user to enter a double 
//and print out an estimate of the cube root of the number 
//and the value of this guess when cubed

// first compile the program
//      javac Root.java
// run the program
//      java Root//

// define a class
import java.util.Scanner;
public class Root{
    
// add main method
 public static void main(String[] args) {
     
    System.out.print("Enter a double to find the cube root of: "); 
        //define what the user will be asked to enter
        
    Scanner myScanner = new Scanner(System.in); //define a Scanner
    
    double num = myScanner.nextDouble(); //collect integer
    double guess = num / 3; //define your first guess using the number you entered 
    
        guess = (2 * guess * guess * guess + num) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + num) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + num) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + num) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + num) / (3 * guess * guess);
        //improve crude estimate with each line to get closer to actual value
            
    double cubed = guess * guess * guess; //cube your guess value
    
    System.out.println(guess);
    System.out.println(cubed);
        //display the value of variable listed

   //test/testtest
   
 } //end of main method
}  //end of class