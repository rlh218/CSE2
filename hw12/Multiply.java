// Rebecca Holowienka
// April 21, 2015
// CSE2
// CSE2 Multiply.java Program
        /**Purpose of this program is to: 
            ~ Implement matrix multiplication on random matrices.
            ~ Begin by implementing a method called randomMatrix() that accepts two input variables: These variables, 
                width and height, are integer sizes for the matrix. 
            ~ As output, randomMatrix() produces a two dimensional array of integers, in row-major representation, 
                whose elements are random integers between -10 and 10.
            ~ Use a version of printMatrix, developed in lab 12, to ensure that your random matrix is correctly generated. 
            ~ Implement matrix multiplication in a method called matrixMultiply().  Your method, multiply(), should accept 
            two 2-dimensional arrays in row-major format, and it should generate a 2-dimensional output array in row-major 
            format.  
            ~ Next, figure out the dimensions of the output array.  
            ~ Finally, compute the linear combinations necessary to compute each matrix element. 
                ~ Implement a main method that asks the user to input the width and height of two matrices.  
                ~ Check in the main method if these dimensions are compatible for matrix multiplication, and 
                    if not, require the user to provide the dimensions again (this is the primary error check.  
                ~ The error check in matrixMultiply() is to catch bugs.  Also, if the user inputs any values that 
                    are non-integer or non-positive, provide an error-specific error message and request the user re-input 
                    the affected integer. 
                ~ Next, generate two random matrices based on the input dimensions, compute their result, and print out 
                    the result matrix.*/
   

// first compile the program
//      javac Multiply.java
// run the program
//      java Multiply

import java.util.Scanner;//import scanner
import java.util.Random;

public class Multiply{
    
	public static void main( String [] arg ){

		Scanner scan = new Scanner( System.in ); //declare scanner
		
		//declare variables
		int height1;
		int height2; 
		int width1;
		int width2;
		
		while (true) {
			System.out.println("First Matrix Dimensions");
			while(true){
				System.out.print("Height: ");
				if (scan.hasNextInt()) {
					height1 = scan.nextInt(); //prompt user to enter value for height1
					if (height1 > 0) {
						break;
					}//close if 
					else {
						System.out.println("Must be a positive dimension.");
						continue;
					}//close else
				}//close if 
				else {
					System.out.println("User must enter an integer.");
					scan.next(); //prompt user to re-enter acceptable value 
				}//close else
			}//close while
			
			while(true){
				System.out.print("Width: ");
				if (scan.hasNextInt()) {
					width1 = scan.nextInt(); //prompt user to enter input value for width1
					if (width1 > 0) {
						break;
					}//close if 
					else {
						System.out.println("Must be a positive dimension.");
						continue;
					}//close else
				}//close if 
				else {
					System.out.println("User must enter an integer.");
					scan.next(); //prompt user to re-enter acceptable value
				}//close else
			}//close while
			
			System.out.println("");//print line between two
			System.out.println("Second Matrix Dimensions");
			
			while(true){
				System.out.print("Height: ");
				if (scan.hasNextInt()) {
					height2 = scan.nextInt();//prompt user to enter input value for height2
					if (height2 > 0) {
						break;
					}//close if 
					else {
						System.out.println("Must be a positive dimension.");
						continue;
					}//close else
				}//close if 
				else {
					System.out.println("User must enter an integer.");
					scan.next();//prompt user to re-enter valid value
				}//close else
			}//close while
			
			while(true){
				System.out.print("Width: ");
				if (scan.hasNextInt()) {
					width2 = scan.nextInt();//prompt user to input value for width2
					if (width2 > 0) {
						break;
					}//close if 
					else {
						System.out.println("Must be a positive dimension.");
						continue;
					}//close else
				}//close if  
				else {
					System.out.println("User must enter an integer.");
					scan.next();//prompt user to re-enter valid value
				}//close else
			}//close while
			
			if (width1 == height2) {
				break;
			}//close if 
			else {
				System.out.println("Width of First Matrix must equal height of Second Matrix.");
				continue;
			}//close else
		}//close while

		System.out.println("");//print out blank line
		
		int[][] matrix1 = randomMatrix(width1, height1); //decalre array
		
		System.out.println("First Matrix (" + height1 + "x" + width1 + "): ");
		       
		       printMatrix(matrix1);
		
		System.out.println("");//print out blank line
		
		int[][] matrix2 = randomMatrix(width2, height2);//declare array
		
		System.out.println("First Matrix (" + height2 + "x" + width2 + "): ");
		
		    printMatrix(matrix2);
	
		System.out.println("");//print out blank line
		
		System.out.println("result (" + height1 + "x" + width2 + "): ");
	
		int[][] result = matrixMultiply(matrix1, matrix2);//declare array
	
	    	printMatrix(result);

	}//close method

	public static int[][] randomMatrix(int width, int height){ //declare method
	
		Random rand = new Random();
	
		int[][] array = new int[height][];//declare array

		for (int x = 0; x < height; x++) {
			array[x] = new int[width]; //switch value of array
			for (int y = 0; y < width; y++) {
				array[x][y] = rand.nextInt(20)-10;
			}//close for loop
		}//close for loop
		
		return array; //tell method what value to return
		
	}//close method

	public static void printMatrix(int[][] array){
	
	    //declare variables
		int height = array.length;
		int width = array[0].length;

		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				int value = array[x][y];//define variable
				String out = "[";
				
				if (value < 0) {
					out += ("-");
					value *= -1;
				}//close if  
				else if(value < 100){
					out += (" ");
				}//close else if
				if (value < 10) {
					out += (" ");
				}//close if
				    out += (value + "]");
				    System.out.print(out); //print "out" value
			}//close for loop
			
			System.out.println(" ");//print space
			
		}//close for loop
	}//close method

	public static int[][] matrixMultiply(int[][] array1, int[][] array2){

        //declare variables
		int height1 = array1.length;
		int width1 = array1[0].length;

		int height2 = array2.length;
		int width2 = array2[0].length;

		if (width1 != height2) {
			System.out.println("Invalid multiplication matrix dimentions.");
			return null;
		}//close if 

		int[][] result = new int[height1][];//declare array

		for (int x = 0; x < height1; x++) { 
			result[x] = new int[width2]; 
			for (int y = 0; y < width2; y++) { 
				for (int z = 0; z < width1; z++) { 
					result[x][y] =+ array1[x][z] * array2[z][y];
				}//close for loop								
			}//close for loop
		}//close for loop
		
		return result; //tell method what value to return
		
	}//close method

}//close public class
