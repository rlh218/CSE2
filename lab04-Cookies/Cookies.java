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

//import scanner
import java.util.Scanner;

//define a class
public class Cookies{
    
//add main method
    public static void main(String[] args) {

//ask user for inputs and make sure they are valid
//declare 1st variable
    int numPeople; 
    
    Scanner myScanner=new Scanner (System.in); //declare scanner
    
    System.out.print("Enter the number of people:"); //ask user for input (number of people)
    
    if(myScanner.hasNextInt()) { //make sure input is an integer
      numPeople=myScanner.nextInt();  
    } //close if
    else{
        System.out.println("You did not enter an integer for the number of people.");
        return; //exit program
    } //close else
    
    if(numPeople>0) { //make sure inputed integer is greater than 0
        numPeople=numPeople;
    } //close if
    else{
        System.out.println("The number of people isn't > 0");
        return; //exit program
    } //close else
    
//declare 2nd variable    
    int numCookies; 
    
    System.out.print("Enter the number of cookies you are planning to buy:"); //ask user to input number of cookies they want to buy
    
    if(myScanner.hasNextInt()) { //make sure input is an integer
        numCookies=myScanner.nextInt();
    } //close if
    else{
        System.out.println("You did not enter an int for cookies");
        return; //exit program
    } //close else
    
    if(numCookies>0) {
        numCookies=numCookies; //valid input
    } //close if
    else{
        System.out.println("The number of cookies isn't greater than 0");
        return; //exit program
    } //close else
    
//declare 3rd variable    
    int numCookiesPerPerson;
    
    System.out.print("How many cookies do you want each person to get:"); //prompt user for number of cookies per person
    
    if(myScanner.hasNextInt()) { //make sure input is an integer
        numCookiesPerPerson=myScanner.nextInt();
    } //close if
    else{
        System.out.println("You did not enter an int for cookies per person");
        return; //exit program
    } //close else
    
    if(numCookiesPerPerson>0) {
        numCookiesPerPerson=numCookiesPerPerson; //valid input
    } //close if
    else{
        System.out.println("The number of cookies per person isn't greater than 0");
        return; //exit program
    } //close else
    
//declare 4th variable    
    int numberNeeded; 
    
    if((numCookies/numPeople) >= numCookiesPerPerson) { //test to see if you have enough cookies
        System.out.print("You have enough cookies for each person ");
    } //close if
    else{
        System.out.print("You will not have enough cookies. ");
        numberNeeded=(numCookiesPerPerson-(numCookies/numPeople))*numPeople; //figure out how many more cookies are needed
        System.out.println("You need to buy at least " + numberNeeded + " more");
    } //close else
    
    if(numCookies % numPeople == 0){
        System.out.println("and the amount will divide evenly");
    } //close if
    else{
        System.out.println("and the amount will not divide evenly");
    } //close else
    
//testtest

    }//end of main method
    
} //end of class