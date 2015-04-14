//Rebecca Holowienka
//CSE2
//April 10, 2015
//lab10-ArrayInputs
//lab10 Java Program
        //Purpose of this program is to: 
            /**Write a program that performs the following tasks:
                    1)    Ask the user to enter the size of an one-dimensional array
                    2)    Ask the user to fill up the array with integers
                    3)    Write a method to check if the input is a positive integer. If the input is not an integer or not positive, the method will return an error message. Re-prompt the user to enter a new input, until the array is completely filled.
                    4)    Print out the array*/

// first compile the program
//      javac ArrayInputs.java
// run the program
//      java ArrayInputs 

import java.util.Scanner; //import scanner
import java.util.Random;

public class ArrayInputs{
	public static void main(String [] arg){

		Scanner scan = new Scanner(System.in); //declare scanner

        System.out.println("Please print out an integer for the size of an array: ");
        System.out.println("Please enter a positive integer: ");
        System.out.println("Sorry you didn't enter an integer.");
        System.out.println("Sorry the number you entered is negative.");
        System.out.println("Please enter 10 positive integers: ");
        System.out.println("The array is: ");







        //declare variables
		int num[] = new int[10];
		int newArray1[];
		int newArray2[];
		int index,target;
		String answer = "";

		do{
			System.out.print("Random input 10 ints [0-9]");
			num = randomInput(); //ask user for input
			String out = "The original array is:";
			out += listArray(num);
			System.out.println(out);

			System.out.print("Enter the index ");
			index = scan.nextInt(); //ask user for input
			newArray1 = delete(num,index);
			String out1 = "The output array is ";
			out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
			System.out.println(out1);

			System.out.print("Enter the target value ");
			target = scan.nextInt(); //ask user for input
			newArray2 = remove(num,target);
			String out2 = "The output array is ";
			out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
			System.out.println(out2);

			System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
			answer = scan.next(); //ask user for input
		} while(answer.equals("Y") || answer.equals("y"));
	} //close do-while loop

	public static String listArray(int num[]){
		String out = "{";
		for(int j=0; j<num.length; j++){
			if(j>0){
				out += ", ";
			} //close if statement
			out += num[j];
		}//close for loop
		out += "} ";
		return out;
	}//close method

