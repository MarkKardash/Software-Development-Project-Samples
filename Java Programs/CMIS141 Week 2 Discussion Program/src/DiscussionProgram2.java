// A program to calculate the total amount of flight hours from Country A to Country B, and then from Country B to Country C
import java.util.Scanner;   //Importing the Scanner
public class DiscussionProgram2 {   //Creating a class
	public static void main(String[] args) { //Don't forget the "main"!
		Scanner scanint=new Scanner(System.in); //Setting up the scanner
		System.out.println("Please enter the number of flight hours from Country A to Country B:"); //Placing the first input request
		int Hours1=scanint.nextInt(); //Saving the first input in variable "Hours1"
		System.out.println("Please enter the number of flight hoursfrom Country B to Country C:"); //Placing the second input request
		int Hours2=scanint.nextInt(); //Saving the second input in variable "Hours2"
		int totalHours; //Creating variable "totalHours"
		totalHours=Hours1+Hours2; //Saving the sum of the two input variables in "totalHours"
		//(Below:) Creating the print statement that will display the result of the calculation
		System.out.print("The total number of flight hours from Country A to Country C is:"+" "+totalHours);
		scanint.close(); //Finally, closing the scanner
		
		
		
		
		
	}

}
