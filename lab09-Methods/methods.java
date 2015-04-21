//Rebecca Holowienka
//CSE 2
//April 17, 2015
//Lab 09: Methods

//This program does:
    /**Methods allow software developers to modularize and reuse their code in many contexts, 
        reducing the chance for bugs and increasing productivity.  This lab will give you basic 
        experience in declaring and calling methods.*/
        
import java.util.Scanner; //import scanner
import java.util.Random; 

public class methods{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //declare scanner
		Random rand = new Random();
		String response = "";
		
		while(true) {
			System.out.println("The " + adjectives() +" "+ adjectives() +" "+ subject() +" "+ verbs() + " the " + adjectives() +" "+ objects() + ".");
			System.out.println("Would you like another sentence? (y/n)");
			    if(scan.hasNext("[Yy]")) {
			    	scan.next();
				continue;
		    	}//close if
			    else if(scan.hasNext("[Nn]")) {
			    	System.exit(0);
			    } //close else if
			    else {
			    	System.out.println("Unknown command - exiting");
			    	System.exit(0);
			}//close else
		}//close while
	}//close method
	
	public static String adjectives() {
		Random rand = new Random();
		
		int ra = rand.nextInt(10);
		String string = "";
		
		switch (ra) {
		case 0: string = "enormous";
				break;
		case 1: string = "tiny";
				break;
		case 2: string = "beautiful";
				break;
		case 3: string = "shiny";
				break;
		case 4: string = "dull";
				break;
		case 5: string = "curly";
				break;
		case 6: string = "hard";
				break;
		case 7: string = "purple";
				break;
		case 8: string = "blue";
				break;
		case 9: string = "soft";
				break;
		}
		
		return string;
	}
	
	public static String subject() {
		Random rand = new Random();
		
		int ra = rand.nextInt(10);
		String string = "";
		
		switch (ra) {
		case 0: string = "couch";
				break;
		case 1: string = "puppy";
				break;
		case 2: string = "cup";
				break;
		case 3: string = "girl";
				break;
		case 4: string = "boy";
				break;
		case 5: string = "pillow";
				break;
		case 6: string = "shoe";
				break;
		case 7: string = "chair";
				break;
		case 8: string = "bag";
				break;
		case 9: string = "laptop";
				break;
		}
		
		return string;
	}
	
	public static String verbs() {
		Random rand = new Random();
		
		int ra = rand.nextInt(10);
		String string = "";
		
		switch (ra) {
		case 0: string = "watched";
				break;
		case 1: string = "sat";
				break;
		case 2: string = "ran";
				break;
		case 3: string = "comforted";
				break;
		case 4: string = "rolled";
				break;
		case 5: string = "flew";
				break;
		case 6: string = "slept";
				break;
		case 7: string = "relaxed";
				break;
		case 8: string = "walked";
				break;
		case 9: string = "swam";
				break;
		}
		
		return string;
	}
	
	public static String objects() {
		Random rand = new Random();
		
		int ra = rand.nextInt(10);
		String string = "";
		
		switch (ra) {
		case 0: string = "couch";
				break;
		case 1: string = "puppy";
				break;
		case 2: string = "cup";
				break;
		case 3: string = "girl";
				break;
		case 4: string = "boy";
				break;
		case 5: string = "pillow";
				break;
		case 6: string = "shoe";
				break;
		case 7: string = "chair";
				break;
		case 8: string = "bag";
				break;
		case 9: string = "laptop";
				break;
		}
		
		return string;
	}
}        