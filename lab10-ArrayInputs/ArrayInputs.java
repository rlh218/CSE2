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

import java.util.Scanner;//import scanner
import java.util.Random;

public class ArrayInputs{
	public static void main(String [] arg){

		Scanner scan = new Scanner(System.in);//declare scanner

		System.out.print("Please enter the size of a one-dimensional array: ");
		int size = scan.nextInt();

		int num[] = new int[size];

		int input = 0;

		System.out.println("Fill array with integers:");
		for (int i = 0; i < num.length; i++) {
			while(true){
				System.out.print("num["+i+"]: ");
				input = checkInput();
				if (input == -1) {
					continue;
				} //close if
				else {
					num[i] = input;
					break;
				}//close else
			}//close while
		}//close for
	
		String out = "The array is: ";
		out += listArray(num);
		System.out.println(out);
	}//close method

	public static int checkInput(){
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		if (scan.hasNextInt()) {
			input = scan.nextInt();
			if (input > 0) {
				return input;
			}//close if 
			else {
				System.out.println("Error: Integer is not positive");
				return -1;
			}//close else
		}//close if 
		else {
			System.out.println("Error: Input is not an integer");
			return -1;
		}//close else
	}//close method
	
	public static String listArray(int num[]){
		String out="{";
		for(int j=0;j<num.length;j++){
			if(j>0){
				out+=", ";
			}//close if
			out+=num[j];
		}//close for
		out+="} ";
		return out;
	}//close method
	
}//close public class

