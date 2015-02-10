//Rebecca Holowienka
//hw03
//February 9, 2015
//Bicycle Java Program

//Purpose of this program:
//Enter two digits, one that gives the number of counts on a cyclometer 
//and the second giving the number of seconds during which the counts occurred
//then print out the distance traveled and the average miles per hour

// first compile the program
//      javac Bicycle.java
// run the program
//      java Bicycle//

import java.util.Scanner;
// define a class
public class Bicycle{
    
// add main method
    public static void main(String[] args) {
    
//our input data
    int feetPerMile = 5280;  
	int inchesPerFoot = 12;  
	int secondsPerMinute = 60; //
	double PI = 3.14159; //
	double wheelDiameter = 27.0; //
	
Scanner myScanner = new Scanner(System.in); //define a scanner 

System.out.print("Enter the number of seconds: "); 
    //display the value of variable you'll be asked to enter
int seconds = myScanner.nextInt(); // collect integer

System.out.print("Enter the number of counts: "); 
    //display the value of variable you'll be asked to enter
int counts = myScanner.nextInt(); //collect integer

double miles, minutes, hours, milesPerHour; //declare variables

miles = (PI * wheelDiameter * counts);
miles = miles/(feetPerMile*inchesPerFoot);
    //setting a value for variable miles

minutes = (seconds/secondsPerMinute);
    //setting a value for variable minutes
hours = (minutes/60);
    //setting a value for variable hours
milesPerHour = (miles/hours);
    //setting a value for variable milesPerHour

miles = Math.round(miles * 100) / 100.0;
minutes = Math.round(minutes * 100) / 100.0;
milesPerHour = Math.round(milesPerHour * 100) / 100.0;

System.out.println("The distance was " + miles + " miles and took " + minutes + " minutes. ");
System.out.println("The average mph was " + milesPerHour + ".");

   //test/testtest
   
 } //end of main method
}  //end of class