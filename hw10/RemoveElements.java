//Rebecca Holowienka
//CSE2
//April 7, 2015
//hw10
//hw10 Java Program
        //Purpose of this program is to: 
            //This homework gives you practice in manipulating arrays and in writing methods that have array parameters.


// first compile the program
//      javac RemoveElements.java
// run the program
//      java RemoveElements 

import java.util.Scanner; //import scanner
import java.util.Random;

public class RemoveElements{
	public static void main(String [] arg){

		Scanner scan = new Scanner(System.in); //declare scanner

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
			answer = scan.next();
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

	public static int[] randomInput(){
		Random rand = new Random();

		int num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = rand.nextInt(10);
		}//close for loop
		return num;
	}//close method

	public static int[] delete(int list[], int pos){

		int length = list.length - 1;
		int num[] = new int[length];
		int count = 0;
		
		if (pos > 9 || pos < 0) {
			System.out.println("The index is not valid.");
			return list;
		} //close if statement
		    else {
			    System.out.println("Index " + pos + " element was removed.");
		    }//close else statement

		for (int i = 0; i < length; i++) {
			if (i == pos) {
				continue;
			} //close if
			    else {
				num[count] = list[i];
				count++;
			} //close else
		}//close for loop
		return num;
	}//close method

	public static int[] remove(int list[], int target){

		int count = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				count++;
			}//close if
		}//close for
		
		if (count == 0) {
			System.out.println("Element " + target + " was not found.");
			return list;
		} //close if  
		    else {
			System.out.println("Element " + target + " was removed ("+count+").");
		    }//close else

		int num[] = new int[list.length - count];
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				continue;
			}//close if 
			    else {
				num[index] = list[i];
				index++;
			    }//close else
		}//close for

		return num;

	}//close method
}//close public class