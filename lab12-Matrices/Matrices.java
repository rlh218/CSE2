//Rebecca Holowienka
//CSE2
//Lab 12 - Matrices
/**The purpose of this proggram is:
    ~ First, implement a method called increasingMatrix() that accepts three input variables:  
        The first two, width and height, are integer sizes for a matrix. The last, a boolean 
        called format, is true if the matrix is to be generated in row-major representation.  
        It generates a column-major representation of the matrix otherwise.  increasingMatrix() 
        outputs a two dimensional array of integers that uses a row- or column-major representation 
        of a matrix whose elements start at 0 in the upper left and increase by 1 along each row, 
        and continuing onto the next row..  The matrix to the right exemplifies this condition.
    ~ Implement printMatrix( int[][] array, boolean format ), a void method that uses System.out.println 
        to print the array to the screen.  If format is true, then assume the input array is in a 
        row-major format, otherwise assume it is in a column major format.  Test your implementation of 
        increasingMatrix using printMatrix, and make sure that the matrices printed always have values that 
        increase along the rows.  If they increase along the columns, you have used the wrong value in format.  
        Note that you do not need to provide width and height as inputs because you can discover what they are 
        using the .length value.  Also, if the input array is null (i.e. array == null evaluates to true), 
        print “the array was empty!”
    ~ Implement translate(int[][] array).  This method should read the input matrix, assuming that it is in a 
        column major format, then copy its values into a newly allocated array in row major format.  Output 
        the new array.
    ~ Next, implement addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb) which accepts two 
        arrays in row or column-major format (specified by formata and formatb).  First, assess whether the arrays 
        can be added: if they can only be added if they have the same width and height.  If they cannot be added, 
        print “the arrays cannot be added!” and return null.  (this command is literally return null; null is the 
        address of a pointer that points to nothing. )  Next, if one of the arrays is in column major format, translate 
        it to a row-major format.  Finally, add the two matrices and output the result as a row-major matrix.  
        Matrix addition on any pair of matrices generates a new matrix where each element is the sum of the elements 
        in the same position in each matrix.
    ~ Finally, implement the main method: Generate two random widths and heights, then generate three increasing matrices: 
        matrices A and B with the first width/height, and matrix C with the second width/height.  A should be row-major, B 
        should be column-major.  Print all of them.  Then attempt to add A to B and A to C, and print the sums.
    ~ Test your methods: the addition of A and B should result in a matrix that increases in twos instead of by ones. 
        All matrices, as printed, should increase along the rows and not the columns.*/
        
        
// first compile the program
//      javac Matrices.java
// run the program
//      java Matrices 

import java.util.Scanner; //import scanner
import java.util.Random;

public class Matrices{
	public static void main(String [] arg){

		Scanner scan = new Scanner(System.in); //declare scanner
		
public static int increasingMatrix(){
        int[1][9] myArray = new int[0][];	
        boolean format=false
        if (boolean=true){ //print matrices in row format
            myArray[0] = new int[3]; 
            myArray[0][0] = a11; myArray[0][1] = a12; myArray[0][2] = a13;
            myArray[1] = new int[3]; 
            myArray[1][0] = a21; myArray[1][1] = a22; myArray[1][2] = a23;
            myArray[2] = new int[3]; 
            myArray[2][0] = a31; myArray[2][1] = a32; myArray[2][2] = a33;
        }
        else(){//print in column format
            int[][] myArray = new int[3][];	//note location of the ‘3’
            myArray[0] = new int[3]; 
            myArray[0][0] = a11; myArray[0][1] = a21; myArray[0][2] = a31;
            myArray[1] = new int[3]; 
            myArray[1][0] = a12; myArray[1][1] = a22; myArray[1][2] = a32;
            myArray[2] = new int[3]; 
            myArray[2][0] = a13; myArray[2][1] = a23; myArray[2][2] = a33;
            }

public static void printMatrix( int[][] array, boolean format ){
    
}//close method


public static string implement addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
    
}//close method

}//close method 
}//close main method
}//close public class