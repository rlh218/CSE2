//Rebecca Holowienka
//CSE2
//March 2, 2015
//HW06
//MakeSymbols Java Program
        //Purpose of this program is to: 
            /** For this program, you need to use do-while loops 
                and the random number generator to generate an 
                integer between 0 and 100. You will first need to 
                print out the number. If the number is even, you 
                will then print out that number of “*” characters; 
                if the number is odd, then you will print out 
                that number of “&” characters. */
                
// first compile the program
//      javac MakeSymbols.java
// run the program
//      java MakeSymbols//

//import scanner
import java.util.Scanner;

    //define a class
    public class MakeSymbols{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

//computer generates random number
int random = (int)(Math.random()*101);
System.out.println("Random number generated: " + random);

//do-while loop to use conditionals to determine what to print out
do{
    if(random%2==0 && random!=0){ //if even print out *
        System.out.print("**");
    }
    else if(random == 1){ //if 1 only print out one &
        System.out.print("&");
    }
    else if(random == 0){ // if zero dont print out anything
        System.out.print("");
    }
    else{ //if odd print out &
        System.out.print("&&");
    }
    random -= 2; //do loop by increments of 2 in order to keep odd numbers odd and even numbers even
} while(random > 0); //run loop as long as random number is greater than 0


} //end of main method
} // end of class
