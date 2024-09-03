//Name: Kardash, Mark     CMIS141 7381     Date:(11/20/2021)
/*This program prompts the user for an integer, divides that integer by 4, and continues dividing
 * every result of the division until it reaches 0.
 */
import java.util.Scanner; //Importing the scanner;

public class Discussion5 { //Creating the class

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //Initializing the scanner;
		
		double N; //Creating "double" variable "N" for the numbers resulting from division
		
		//Below: Prompting the user for a positive integer.
		System.out.print("Please enter a positive integer:");
		double num= scan.nextDouble(); //Storing the integer into the "num" double variable.
		
//Below: Creating the "for" loop and conditions to divide the numbers. (I set the number subject
//to division,N, to be higher than one. This is for practical purposes, as otherwise the program
//went into powers of "E", and it was impossible to capture the whole output in a screenshot.
		
		for (N=num; N>1;) { 
			
			N=N/4; //Creating the new number by divding the previous one.
			
			System.out.println(N); //Printing out the new number
		}
				
			 }
		}

	


