//Rebecca Holowienka
//February 11, 2015
//CSE2
//Cookies Java Program
    //Purpose of this program is to:
        /**write a program that uses the Scanner class to obtain from users:
            how many cookies they want
            how many people they are buying for
            how many cookies they want each person to get*/
        /**then determine if the number of cookies is evenly divisible among
            the people and if there is enough for each person
            if there are not enough cookies tell the user how many more are needed*/

// first compile the program
//      javac Cookies.java
// run the program
//      java Cookies//

import java.util.Scanner;

// define a class
public class Cookies{
    
    //main method requiured for every java program
    // add main method
    public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor        
Scanner myScanner = new Scanner (System.in);

        //define variables/ input -> use if/else statements
            int nPeople;
            System.out.println("Enter the number of people (an integer > 0): ");
            if ( myScanner.hasNextInt()){
                nPeople=myScanner.nextInt();
            }
                else{
                    System.out.println("You did not enter an integer for number of people.");
                return;
                }
            if( nPeople > 0 ){
                nPeople = nPeople;
            }
                else{  
                    System.out.println("You did not enter an int > 0 ");
                    return;     //leave the program, i.e.
                                //the program terminates
            }
            
            
            
            int nCbuying;
            System.out.println("Enter the number of cookies you are planning to buy (an integer > 0): ");
            if(myScanner.hasNextInt()) {
                nCbuying = myScanner.nextInt();
            }
                else{
                    System.out.println("You didn't enter an integer.");
                    return;
                }
            if( nCbuying >0 ){
                nCbuying = nCbuying;
            }
                else{
                    System.out.println("You did not enter an int > 0 ");
                    return;
            }
            
            
            
            int nCPerPerson;
            System.out.println("How many do you want each person to get? (an integer > 0) ");
            if(myScanner.hasNextInt()) {
                nCPerPerson = myScanner.nextInt();
            }
                else{
                    System.out.println("You did not enter an integer.");
                    return;
                }
            if ( nCPerPerson >= 0 ){ 
                nCPerPerson = nCPerPerson;
            }
                else{
                    System.out.println("You did not enter an int greater than or equal to 0.");
                    return;
                }
            
            
            int quantityCookies;
            if ((nCbuying/nPeople)>=nCPerPerson) {
                System.out.println("You have enough cookies for each person.");
            }
                else{
                    System.out.println("You will not have enough cookies.");
                    //CHECKKK quantityCookies = ((nCPerPerson-(nCbuying/nPeople))*nPeople);
                    System.out.println("You need to buy at least " + quantityCookies + " more.");
                }
            if(nCbuying%nPeople == 0){
                System.out.println("And the amount will divide evenly.");
            }
                else{
                    System.out.println("But the amount will not divide evenly.");
                }
            
            
 //test/testtest
                
     }//end of main method
   
 } //end of class
