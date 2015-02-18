//Rebecca Holowienka
//February 17, 2015
//CSE2
//HW04
//Banking Java Program
    //Purpose of this program is to:
        /** Write a program using switch statements that allows users to process banking transactions.
            Start the user off with a random amount between 1,000 and 5,000 in their bank account.
            Then offer them the choice of depositing money, withdrawing money, or viewing their balance.
            If they choose to deposit, ask them how much they want to deposit and make sure they enter a positive number. 
            Then print their resulting balance. 
            If they choose to withdraw, ask them how much they want to withdraw and make sure it is a positive number no more than the amount in their account. 
            Then print the resulting balance.*/

// first compile the program
//      javac Banking.java
// run the program
//      java Banking//

//import scanner
import java.util.Scanner;

    //define a class
    public class Banking{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);
        
        /** Start the user off with a random amount between 1,000 and 5,000 in their bank account 
         using the java.util.Random library or the Random function in the java.lang.Math library.*/        
             int balance = (int)(Math.random() * 4000) + 1000; 
        
        //Give user choice to deposit money, withdraw money, or view their balance
        System.out.println("To view balance type V or v"); 
        System.out.println("To deposit type D or d"); 
        System.out.println("To withdraw type W or w"); 
        
        String bank=myScanner.next(); //ask user for input
        
        switch (bank){
                
                case"v":case"V": //if user wants to view their balance
                     System.out.println("Your balance is: " + balance); //give balance
                     break; //break out of switch
               
                case"d":case"D": //if user wants to deposit money
                    System.out.println("How much would you like to deposit"); //ask how much they want to deposit
                    balance+= myScanner.nextInt(); //add amount to random amount
                    System.out.println("Your balance is: " + balance); //give balance
                    break; //break
                    
                case"w":case"W": //if user wants to withdraw money
                    System.out.println("How much would you like to withdraw"); //aks how much they want to withdraw
                    int temp = myScanner.nextInt(); //accept input
                        if( temp > balance ){ //check if bank account has that amount
                            System.out.println("Number is too large to withdraw"); //tell them number is too large
                            System.exit( 0 ); //exit
                        } //close if
                        
                   else { 
                       balance-= temp; //calculate how much is left in account
                       System.out.println("Your balance is: " + balance); //give amount  
                   } //close else
                    break; //break
                    
                default: //if no above cases are entered
                    System.out.println("Please enter correct input"); 
                    break;
                    
                
        } //close switch

        
    } //end of main method
} //end of class