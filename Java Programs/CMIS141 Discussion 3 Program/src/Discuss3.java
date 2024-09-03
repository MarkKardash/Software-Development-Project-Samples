//Name: Kardash, Mark         CMIS141 7381         Date: (11/06/2021)
//A program that will tell if a TV show is short-lived, average standing, or long-standing, based on the number of years.
import java.util.Scanner; //Importing the scanner
public class Discuss3 { //Creating the class
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Setting up the scanner
		double Years; //Creating Double variable "Years".
		//Below: Prompting the user for the number of years the TV show lasted.
		System.out.print("Please enter the number of years the TV show lasted for:");
		Years=input.nextDouble(); //Storing the number of years inside the variable "Years".
		
		
		
		if (Years<=3) //Setting up the "if" and "else if" statements for the various possibilities.
			System.out.println("This is a short-lived TV show.");
		else if (9<=Years) 
			System.out.println("This is a long-lasting TV show.");
		else if (Years>=4)
			System.out.println("This is an average-lasting TV show.");
		input.close(); //Closing the scanner.
		

		
	}

}
