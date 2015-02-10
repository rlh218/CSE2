//Rebecca Holowienka
//February 6, 2015
//CSE2
//BigMac Java Program
    //Purpose of this program is to:
        //compute the cost of buying a certain number of BigMacs
        //Use the Scanner class to determine:
            //how many BigMacs were bought
            //the cost per BigMac
            //the percentage tax 

// first compile the program
//      javac BigMac.java
// run the program
//      java BigMac//

import java.util.Scanner;

// define a class
public class BigMac{
    
    //main method requiured for every java program
    // add main method
    public static void main(String[] args) {

        //declare an instance of the Scanner object
            Scanner myScanner; //

        //construct an instance of the Scanner class 
            myScanner = new Scanner(System.in);

            //define variables/ input
                int nBigMacs = myScanner.nextInt();
                System.out.print("Enter the number of Big Macs (an integer > 0): ");
                System.out.print("Enter the cost per Big Mac as" + 
                    " a double (in the form xx.xx): ");
                double bigMac$ = myScanner.nextDouble();
                System.out.print(
                    "Enter the percent tax as a whole number (xx): ");
                double taxRate = myScanner.nextDouble ();
                taxRate/=100; //user enters percent, but I want proportion
                
            //output
                double cost$;
                int dollars,   
                    //whole dollar amount of cost 
                dimes, pennies; //for storing digits
                    //to the right of the decimal point 
                    //for the cost$ 
                cost$ = nBigMacs*bigMac$*(1+taxRate);
                    //get the whole amount, dropping decimal fraction
                dollars = (int)cost$;
                    //get dimes amount, e.g., 
                    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                    //  where the % (mod) operator returns the remainder
                    //  after the division:   583%100 -> 83, 27%5 -> 2 
                dimes = (int)(cost$*10)%10;
                pennies = (int)(cost$*100)%10;
                System.out.println("The total cost of " +nBigMacs
                     + " BigMacs, at $" + bigMac$ +" per bigMac, with a" +  
                     " sales tax of " + (int)(taxRate*100) + "%, is $" 
                     +dollars+ '.' +dimes+pennies);
                     
    //test/testtest
   
   } //end of main method
}  //end of class