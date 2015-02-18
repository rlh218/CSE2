//Rebecca Holowienka
//February 11, 2015
//CSE2
//Cookies Java Program
    //Purpose of this program is to:
        /**write a program that uses the Scanner class to obtain from users:
            how many cookies they want
            how many people they are buying for
            how many cookies they want each person to get*/
        /**then determine if the number of cookies is evenly divisible among
            the people and if there is enough for each person
            if there are not enough cookies tell the user how many more are needed*/

// first compile the program
//      javac Cookies.java
// run the program
//      java Cookies//

import java.util.Scanner;

// define a class
public class Cookies{
    
    //main method requiured for every java program
    // add main method
    public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

        //define variables/ input -> use if/else statements
            System.out.println("Enter the number of people (an integer > 0): ");
            int nPeople = myScanner.nextInt();
            if ( nPeople > 0 ){
            }
            else if ( nPeople < 0 ){  
                System.out.println("You did not enter an int > 0 ");
                return;     //leave the program, i.e.
                                //the program terminates
            }
            
            System.out.println("Enter the number of cookies you are planning to buy (an integer > 0): ");
            double nCbuying = myScanner.nextDouble();
            
            System.out.println("How many do you want each person to get? (an integer > 0) ");
            double nCget = myScanner.nextDouble ();
            
            if ( nCget >= 0 ){ 
                System.out.println("You have enough cookies for each person and the amount will divide evenly. ");
            }
            else if ( nCget == 4 ) {
                System.out.println("You will not have enough cookies. You need to buy at least 10 more.");
                return;
            }
            else if ( nCget == 3 ) {
                System.out.println("You have enough, but they will not divide evenly.");
                return;
            }
            
 //test/testtest
                
     }//end of main method
   
 } //end of class

