//Rebecca Holowienka
//February 16, 2015
//CSE2
//WhichNumber Java Program
    //Purpose of this program is to:
        /**write a program that prompts the user to think of an int between 
        1 and 10 inclusive, and then answer the questions asked of you*/

// first compile the program
//      javac WhichNumber.java
// run the program
//      java WhichNumber//

import java.util.Scanner;

// define a class
public class WhichNumber{
    
    //main method requiured for every java program
    // add main method
    public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

//prompt user to think of an integar between 1 and 10 inclusive
    System.out.println("Think of a number between 1 and 10");
    String yes = "y, Y";
    String no= "n, N";
    
        char answer1; //declare variable
        char answer2; //declare variable
        char answer3; //declare variable
        char answer4; //declare variable
        char answer5; //declare variable
        char answer6; //declare variable
        char answer7; //declare variable
        char answer8; //declare variable
        char answer9; //declare variable
        
System.out.println("Is the number even?"); //first question prompted to answer from flow chart
    answer1=myScanner.next().charAt(0); //input answer1 based on which number you choose 
        
    if(answer1 == 'y' || answer1=='Y'){ //if answer1 is yes
       System.out.println("Is it divisible by 3?"); //question2 on left prompted to answer
            answer2=myScanner.next().charAt(0); //input answer2 based on which number you chose
                
            if(answer2 == 'y' || answer2=='Y'){ //if answer2 from left side is yes
                System.out.println("6"); //answer is 6
                return; //terminate program
            } //close if
            
            else if(answer2 == 'n' || answer2=='N'){ //if answer2 is no
                System.out.println("Is the number divisible by 4?"); //question3 on left prompted to answer
                    answer3=myScanner.next().charAt(0); //input answer3 based on which number you chose
                        
                    if(answer3 == 'y' || answer3=='Y'){ //if answer3 is yes
                        System.out.println("Is the number divided by 4 greater than 1?"); //question4 on left prompted to answer
                            answer4=myScanner.next().charAt(0); //input answer4 based on which number you chose
                                
                            if(answer4 == 'y' || answer4=='Y'){ //if answer4 is yes
                                System.out.println("8"); //answer is 8
                                return; //terminate program
                            } //close if
                            
                            else if(answer4 == 'n' || answer4=='N'){ //if answer4 is no
                                System.out.println("4"); //answer is 4
                                return; //terminate program
                            } //close else if
                            
                    } //close if
                    
                    else if(answer3 == 'n' || answer3=='N'){ //if answer3 is no
                        System.out.println("Is it divisible by 5?"); //question5 on left prompted to answer
                            answer5=myScanner.next().charAt(0); //input answer5 based on which number you chose
                                
                            if(answer5 == 'y' || answer5=='Y'){ //if answer5 is yes
                                System.out.println("10"); //answer is 10
                                return; //terminate program
                            } //close if
                            
                            else if(answer5 == 'n' || answer5=='N'){ //if answer5 is no
                                System.out.println("2"); //answer is 2
                                return; //terminate program
                            } //close else if
                            
                    } //close else if
                    
            } //close else if
            
    } //close if


//repeat actions from left side for right side
        else if(answer1 == 'n' || answer1=='N'){
            System.out.println("Is it divisible by 3?");
                answer6=myScanner.next().charAt(0);
                
                if(answer6 == 'y' || answer6 =='Y'){
                    System.out.println("When divided by 3 is the result greater than 1?");
                        answer7=myScanner.next().charAt(0);
                        
                        if(answer7 == 'y' || answer7 =='Y'){
                            System.out.println("9");
                            return;
                        }
                        
                        else if(answer7 == 'n' || answer7 =='N'){
                            System.out.println("3");
                            return;
                        }
                        
                }
                
                else if(answer6 == 'n' || answer6 =='N'){
                    System.out.println("Is it greater than 6?");
                        answer8=myScanner.next().charAt(0);
                        
                        if(answer8 == 'y' || answer8 =='Y'){
                            System.out.println("7");
                            return;
                        }
                        
                        else if(answer8 == 'n' || answer8 =='N'){
                            System.out.println("Is it less than 3?");
                                answer9=myScanner.next().charAt(0);
                                
                                if(answer9 == 'y' || answer9 =='Y'){
                                    System.out.println("1");
                                    return;
                                }
                                
                                else if(answer9 == 'n' || answer9 =='N'){
                                    System.out.println("5");
                                    return;
                                } //close else if
                                
                        } //close else if
                        
                } //close else if
                
        } //close if
        
    //test/testtest
   
   } //end of main method
}  //end of class

