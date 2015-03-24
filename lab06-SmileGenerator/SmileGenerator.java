//Rebecca Holowienka
//CSE2
//February 27, 2015
//Lab 06
//Space Exploration Java Program
        //Purpose of this program is to: 
            /**Please print out 5 smiley faces using non-nested for loops. 
               Then do it again with while loops and do-while loops. Create a 
               second loop to print out a random number of smiley faces using “math.random()”. 
               Unfortunately, the smiley faces run off the right side of the screen, when 
               many are randomly generated. Create a third loop that limits the number of 
               smiley faces on any line to 30. Finally, create a fourth loop that increases 
               the number of smiley faces on each line by one for every new line that is used. 
               Use only one loop. */


//define a class
public class SmileGenerator{

//add main method    
    public static void main(String[] args) {
    
    //create loop to print out smileys
       //declare all variables/inputs
    	for (int i = 0; i < 5; i++) {
    		System.out.print(":)");
		} //close for loop
		
    	System.out.println("");//print space
    	
    	int random = (int)(Math.random() * 100); //prompting program to have random num of :) for output
    	    	
    	for (int j = 0; j < random; j++) { 
    	    
    		if (j == 30 || j == 60 || j == 90) {
    			System.out.println("");//print space
    		}//close if statement
    		
    		System.out.print(":)");
		}//close for loop
    	
    	System.out.println("");//print space
    	
    	for (int k = 0; k < random; k++) {
			for (int l = 0; l < k; l++) {
				System.out.print(":)");				
			}//close nested for loop
			
			System.out.println("");//print space
		}//close for loop
    	
  
//testtest

    }//end of main method
}//end of class
