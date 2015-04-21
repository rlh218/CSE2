// Rebecca Holowienka
// April 14, 2015
// CSE2
// CSE2Linear.java Java Program
        /**Purpose of this program is to: 
            ~ Write a program called CSE2Linear.java that prompts the user to enter 15 ints for students’ final grades in CSE2. 
            ~ Check that the user only enters ints, and print an error message if the user enters anything other than an int.  
            ~ Print a different error message for an int that is out of the range from 0-100, and finally a third error message 
                if the int is not greater than or equal to the last int.  
            ~ Print the final input array.  
            ~ Next, prompt the user to enter a grade to be searched for. 
            ~ Implement a binary search to find the entered grade. 
            ~ Indicate if the grade was found or not, and print out the number of iterations used. 
            ~ Next, scramble the sorted array randomly, and print out the scrambled array. 
            ~ Prompt the user again to enter an int to be searched for, and use linear search to find the grade. 
            ~ Indicate if the grade was found or not, and how many iterations it took.*/
   

// first compile the program
//      javac CSE2Linear.java
// run the program
//      java CSE2Linear

import java.util.Scanner; //import scanner
import java.util.Random;

public class CSE2Linear{
	public static void main(String [] arg){

		Scanner scan = new Scanner(System.in); //declare scanner

		int grades[] = new int[15]; //declare variable grades

		System.out.println("Enter 15 integers for final grades in CSE2:"); //prompt user to enter an integer input value for 15 final grades.

		int first = 0; //declare variable first as integer
		int last = 0; //declare variable last as integer

		for (int x = 0; x < grades.length; x++) {
			while (true) {

				System.out.print("[" + (x+1) + "]: ");
				if (scan.hasNextInt()) {
					first = scan.nextInt();
					if (first < 0 || first > 100) {
						System.out.println("Invalid input! Value entered is not within range (0-100)");
						continue;
					}//close inside if 
					else if (first < last) {
						System.out.println("Invalid input! Value not greater than or equal to last input ("+last+")");
						continue;
					}//close else if 
					else {
						grades[x] = first;
						last = first;
						break;
					} //close else
				}//close if 
				else {
					System.out.println("Invalid input! Value entered is not an integer.");
					scan.nextInt();
					continue;
				} //close else

			} //close while loop
		} //close for loop

		String result = "Grades (sorted): "; //declare string variable result
		result += listArray(grades);
		System.out.println(result);

		int search = 0; //declare int variable search

		while (true) {
			System.out.print("Enter a grade to search for: ");
			if (scan.hasNextInt()) {
				search = scan.nextInt();
				if (search < 0 || search > 100) {
					System.out.println("Please enter a valid integer between 0 and 100");
				}//close inside if 
				else {
					break;
				}//close else
			}//close if 
			else {
				System.out.println("Please enter a valid integer between 0 and 100");
				scan.nextInt();
			}//close else
		}//close while
		
		int iterations = binarySearch(grades, search); //declare int variable iterations
		
		if (iterations > 0) {
			System.out.println(search + " was found in the list with " + iterations + " iterations");	
		}//close if 
		else {
			System.out.println(search + " was not found in the list with " + (-1)*(iterations) + " iterations");
		}//close else
		
		System.out.println(""); //print out space

		grades = scramble(grades); 
		
		result = "Grades (scrambled): ";
		result += listArray(grades);
		System.out.println(result);
		
		while (true) {
			System.out.print("Enter a grade to search for: ");
			if (scan.hasNextInt()) {
				search = scan.nextInt();
				if (search < 0 || search > 100) {
					System.out.println("Please enter a valid integer between 0 and 100");
				}//close inside if 
				else {
					break;
				}//close else
			}//close if 
			else {
				System.out.println("Please enter a valid integer between 0 and 100");
				scan.nextInt();
			}//close else
		}//close while
		
		iterations = linearSearch(grades, search);
		
		if (iterations > 0) {
			System.out.println(search + " was found in the list with " + iterations + " iterations");	
		}//close if
		else {
			System.out.println(search + " was not found in the list with " + (-1)*(iterations) + " iterations");
		}//close else

	}//close method

	public static String listArray(int num[]){
		String result = "{";
		for(int y = 0; y < num.length; y++){
			if(y > 0){
				result += ", ";
			}//close if
			result += num[y];
		}//close for
		result += "} ";
		return result;//define what will be the return of method
	}//close method

	public static int[] scramble(int num[]){
		Random rand = new Random();

		for (int x = 0; x < num.length; x++) {
			int index = rand.nextInt(15);
			int temp = num[index];
			num[index] = num[x];
			num[x] = temp;
		}//close for loop
		return num; //define what will be returned from method
	}//close method
	
	public static int binarySearch(int array[], int key){
		int base = 0;
		int top = array.length - 1;
		
		int iterations = 1;
		int num = (int)(base + top)/2;
		
		while ((array[num] != key) && (base <= top)){
			iterations++;
			if (array[num] > key) {
				top = num - 1;
			}//close if 
			else {
				base = num + 1;
			}//close else
			num = (int)(base + top)/2;
		}//close while loop
		if (base <= top) {
			return iterations;
		}//close if 
		else {
			return (-1)*(iterations);
		}//close else
	}//close method
	
	public static int linearSearch(int array[], int key){
		int iterations = 0;
		for (int x = 0; x < array.length; x++) {
			iterations++;
			if (array[x] == key) {
				return iterations;				
			}//close if
		}//close for
		return (-1)*(iterations); //declare what the return will be
	}//close method
	
}//close public class