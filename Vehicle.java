import java.util.Scanner;
// Read over the provided code. Reflect on the purpose of each block.
// Do not change or delete any provided code.
// Create a new class in the same project to hold your main() method.
// Interact with this class from your main() method.

public class Vehicle {

// private fields / internal data  
	private int year;  				// year the vehicle was manufactured
	private int miles;				// miles on the total odometer
	private double mpg; 			// miles per gallon the vehicle gets
	
	
// public methods / operations
	// constructor - used to create an object from the class
	public Vehicle() { 
		// this one is empty; we'll see constructors with code soon!
	}
	
	// setters (mutators) and getters (accessors)
	public int getYear() {
		return year;			// return THIS object's year value
	}

	public void setYear(int year) {
		this.year = year;		// set THIS object's year to argument (year) value
	}

	public int getMiles() {
		return miles;			// return THIS object's miles value
	}

	public void setMiles(int miles) {
		this.miles = miles;		// set THIS object's miles to argument (miles) value
	}

	public double getMpg() {
		return mpg;				// return THIS object's mpg value
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;			// set THIS object's mpg to argument (mpg) value
	}
		
	// instance methods
	public void drive(int miles) {
		this.miles += miles;	// add argument miles value to THIS object's miles
	}


public static void main(String[] args) {
    
    //New Scanner to get user input
	Scanner scnr = new Scanner(System.in);

    //Setting the parameters for Vehicle1
	int vehicle_1_Year = 2021;
	int vehicle_1_Miles = 250;
	double vehicle_1_Mpg = 24.5;

    //Creating the Vehicle #1 object
	Vehicle vehicle1 = new Vehicle();
	

    //Setting the variables for vehicle #1
	vehicle1.setYear(vehicle_1_Year);
	vehicle1.setMiles(vehicle_1_Miles);
	vehicle1.setMpg(vehicle_1_Mpg);
    
    //Printing out Vehicle #1 variables
	System.out.println("Vehicle #1 Year: " + vehicle1.year);
	System.out.println("Vehicle #1 Mpg: " + vehicle1.mpg);
	System.out.println("Vehicle #1 Trip #1: " + vehicle1.miles + " Miles");
    
    //Asking the user how far the want to go for trip #2
    System.out.println("How far would you like to go for Trip #2?");
    
    //Getting user input and printing the value back out
    int vehicle_1_UserMiles = scnr.nextInt();
    System.out.println("Vehicle #1 Trip #2: " + vehicle_1_UserMiles + " Miles");
    
    //taking both values of trip #1 and #2 and adding them together and then printing the total
    vehicle1.drive(vehicle_1_UserMiles);
    System.out.println("Vehicle #1 Total Trips: " + vehicle1.miles + " Miles");

    System.out.println("");

    //creating the parameters for vehicle #2
    int vehicle_2_Year = 2015;
	int vehicle_2_Miles = 325;
	double vehicle_2_Mpg = 16.25;

    //Creating vehicle #2
    Vehicle vehicle2 = new Vehicle();
    
    //Setting all of vehicle #2 variables
    vehicle2.setYear(vehicle_2_Year);
	vehicle2.setMiles(vehicle_2_Miles);
	vehicle2.setMpg(vehicle_2_Mpg);
    
    //Printing out vehicle #2 varibles
	System.out.println("Vehicle #2 Year: " + vehicle2.year);
	System.out.println("Vehicle #2 Mpg: " + vehicle2.mpg);
	System.out.println("Vehicle #2 Trip #1: " + vehicle2.miles + " Miles");
    
    //Asking for user input for Trip #2
    System.out.println("How far would you like to go for Trip #2?");
    
    //Taking in user input and printing it back to them
    int vehicle_2_UserMiles = scnr.nextInt();
    System.out.println("Vehicle #2 Trip #2: " + vehicle_2_UserMiles + " Miles");
    
    //Taking both trips and adding them together and printing them out
    vehicle2.drive(vehicle_2_UserMiles);
    System.out.println("Vehicle #2 Total Trips: " + vehicle2.miles + " Miles");

    
}
}
