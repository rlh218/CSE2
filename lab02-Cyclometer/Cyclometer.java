//Rebecca Holowienka
//January 30, 2015
//CSE2
//Cyclometer Java Program
    //Purpose of this program is to:
        //print the number of minutes for each trip
        //print the number of counts for each tirp
        //print the distance of each trip in miles
        //print the distance for the two trips combined

// first compile the program
//      javac Cyclometer.java
// run the program
//      java Cyclometer//

// define a class
public class Cyclometer{
    
    //main method requiured for every java program
// add main method
 public static void main(String[] args) {
     
//our input data
    int secsTrip1=480;  //
    int secsTrip2=3220;  //
	int countsTrip1=1561;  //
	int countsTrip2=9037; //
	
// our intermediate variables and output data
    double wheelDiameter=27.0,  //
  	PI=3.14159, //
  	feetPerMile=5280,  //
  	inchesPerFoot=12,   //
  	secondsPerMinute=60;  //
	double distanceTrip1, distanceTrip2, totalDistance;  //

//print out the numbers that you 
//have stored in the variables 
//that store number of seconds and the counts
    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");

//run the calculations; store the values. 
//Document your calculation here.
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; 
	    // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");

   //test/testtest
   
 } //end of main method
}  //end of class