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
    public static void main(String[] args){

//Step 1: Print out 5 smiley faces using non-nested loops.
System.out.println(":):):):):)");

//Step 1: Print out 5 smiley faces using while loop.
int smile = 0;
while (smile < 5){
    System.out.print(":)");
    smile++;
}

//Step 1: Print out 5 smiley faces using do-while loop.
//do{
    
    
//}while();

//Step 2: Create a second loop to print out a random number of smiley faces using “math.random()”.
int smiles = 0; //define variable
        smiles = (int)((Math.random()*100)+1); 
        System.out.println(":)");
        smiles++;
        



}
}