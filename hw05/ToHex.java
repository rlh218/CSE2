//Rebecca Holowienka
//CSE2
//February 24, 2015
//HW05
//ToHex Java Program
    //Purpose of this program is to:
        /** Develop a program which takes decimal RGB values (three inputs) 
            and convert them to hexadecimal. */

// first compile the program
//      javac ToHex.java
// run the program
//      java ToHex//

//import scanner
import java.util.Scanner;

    //define a class
    public class ToHex{
    
        //main method requiured for every java program
        // add main method
            public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

System.out.println("Please enter three numbers representing RGB values: ");

//value1 = R
//value2 = G
//value3 = B
int value1 = myScanner.nextInt();
int value2 = myScanner.nextInt();
int value3 = myScanner.nextInt();


//making sure input is valid
if( value1 >= 0 && value1 <= 255 ){
}
    else{
        System.out.println("Sorry, you must enter values between 0-255.");
        return;
    }
    

if( value2 >= 0 && value2 <= 255 ){
}
    else{
        System.out.println("Sorry, you must enter values between 0-255.");
        return;
    }
    
if( value3 >= 0 && value3 <= 255 ){
}
    else{
        System.out.println("Sorry, you must enter values between 0-255.");
        return;
}

//convert from decimal to hexadecimal
String number1, number2, number3, number4, number5, number6;
number1 = Integer.toString((value1 - (value1%16))/16); //the first number in the list
number2 = Integer.toString(value1%16); //the second number in the list

        //deciaml to hexadecimal values
        switch (number1){
                case"10":
                    number1 = "A";
                    break;
                    
                case"11":
                    number1 = "B";
                    break;
                    
                case"12":
                    number1 = "C";
                    break;
                    
                case"13":
                    number1 = "D";
                    break;
                    
                case"14":
                    number1 = "E";
                    break;
                
                case"15":
                    number1 = "F";
                    break;
        } //close switch

        switch (number2){
                case"10":
                    number2 = "A";
                    break;
                    
                case"11":
                    number2 = "B";
                    break;
                    
                case"12":
                    number2 = "C";
                    break;
                    
                case"13":
                    number2 = "D";
                    break;
                    
                case"14":
                    number2 = "E";
                    break;
                
                case"15":
                    number2 = "F";
                    break;
        } //close switch
        
number3 = Integer.toString((value2 - (value2%16))/16); // the third number in the list
number4 = Integer.toString(value2%16); //the fourth number in the list

        //deciaml to hexadecimal values
        switch (number3){
                case"10":
                    number3 = "A";
                    break;
                    
                case"11":
                    number3 = "B";
                    break;
                    
                case"12":
                    number3 = "C";
                    break;
                    
                case"13":
                    number3 = "D";
                    break;
                    
                case"14":
                    number3 = "E";
                    break;
                
                case"15":
                    number3 = "F";
                    break;
        } //close switch

        switch (number4){
                case"10":
                    number4 = "A";
                    break;
                    
                case"11":
                    number4 = "B";
                    break;
                    
                case"12":
                    number4 = "C";
                    break;
                    
                case"13":
                    number4 = "D";
                    break;
                    
                case"14":
                    number4 = "E";
                    break;
                
                case"15":
                    number4 = "F";
                    break;
        } //close switch
        
number5 = Integer.toString((value3 - (value3%16))/16); //the fifth number in the list
number6 = Integer.toString(value3%16); //the sixth number in the list

        //deciaml to hexadecimal values
        switch (number5){
                case"10":
                    number5 = "A";
                    break;
                    
                case"11":
                    number5 = "B";
                    break;
                    
                case"12":
                    number5 = "C";
                    break;
                    
                case"13":
                    number5 = "D";
                    break;
                    
                case"14":
                    number5 = "E";
                    break;
                
                case"15":
                    number5 = "F";
                    break;
        } //close switch

        switch (number6){
                case"10":
                    number6 = "A";
                    break;
                    
                case"11":
                    number6 = "B";
                    break;
                    
                case"12":
                    number6 = "C";
                    break;
                    
                case"13":
                    number6 = "D";
                    break;
                    
                case"14":
                    number6 = "E";
                    break;
                
                case"15":
                    number6 = "F";
                    break;
        } //close switch

System.out.println("The decimal numbers are R: " + value1 + ", G: " + value2 + ", B: " + value3 +
    ", is represented in hexadecimal as : " +number1+number2+number3+number4+number5+number6 + ".");


  //testtest  
    } //end of main method
} //end of class
