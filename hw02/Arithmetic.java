//Rebecca Holowienka
//hw02
//January 31, 2015
//Arithmetic Java Program
//
//Purpose of this program is to:
        //Compute the cost of the items you bought at Walmart, 
        //including the PA sales tax of 6%

// first compile the program
//      javac Arithmetic.java
// run the program
//      java Arithmetic//

// define a class
public class Arithmetic{
    
// add main method
 public static void main(String[] args) {
     
//our input data
    //Number of pairs of socks
        int nSocks=3; //
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
        double sockCost$=2.58; //
    //Number of drinking glasses
        int nGlasses=6; // 
    //Cost per glass
        double glassCost$=2.29; // 
    //Number of boxes of envelopes
        int nEnvelopes=1; //
    //cost per box of envelopes
        double envelopeCost$=3.25; //
    //sales tax for PA is 6%
        double taxPercent=0.06; //
    
//things to calculate
    //total cost of each kind of item
        double totalSockCost$ = (sockCost$ * nSocks); //
        double totalGlassCost$ = (glassCost$ * nGlasses); // 
        double totalEnvelopeCost$ = (envelopeCost$ * nEnvelopes); //
    //total cost of purchases (before tax)
        double totalSaleAmount = (totalSockCost$ + (totalGlassCost$ + totalEnvelopeCost$)); //
    //sales tax for that total cost
        double totalSalesTax = ((totalSaleAmount * taxPercent) + totalSaleAmount); //
    //total actually paid for this transaction, including sales tax
        double totalFinalSaleAmount = (totalSaleAmount + totalSalesTax); //
 
/**Print out the numbers that you 
   have stored in the variables 
   that store number of seconds and the counts*/
        System.out.println("The total cost of socks " + totalSockCost$);
	    System.out.println("The total cost of glasses " + totalGlassCost$);
	    System.out.println("The total cost of envelopes " + totalEnvelopeCost$);
	    
	    System.out.println("Total cost before sales tax ");
	    System.out.printf("%.2f %n" , totalSaleAmount);
	    
	    System.out.println("Sales tax for the entire purchase ");
	    System.out.printf("%.2f %n" , totalSalesTax);
	    
	    System.out.println("Total amount paid for the transaction, including sales tax ");
	    System.out.printf("%.2f %n" , totalFinalSaleAmount);
        
//Run the calculations; store the values. 
//Document your calculation here.
   
//Print out the output data.

   //test/testtest
   
 } //end of main method
}  //end of class