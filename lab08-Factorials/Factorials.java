//Rebecca Holowienka
//CSE 2
//March 31, 2015
//Lab 08: Factorials

//This program does:
    //*Provide the code for the three methods, based on the output that you are supposed to receive.
        //main method, factorial method, and print method

import java.util.Scanner;

    public class Factorials {
        
	    public static void main(String[] args) {
	        
		    Scanner scan = new Scanner(System. in );
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += factorial(i);
		}
		print(sum);
	}

	public static int factorial(int input) {
		int mul = 1;
		for (int i = 1; i <= input; i++) {
			mul *= i;
		}
		System.out.println(mul);
		return mul;
	}

	public static void print(int output) {
		System.out.println("The super factorial is equal to " + output);
	}
}