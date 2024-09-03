//Name: Kardash, Mark     CMIS141 7381     Date:(11/27/2021)

//This program uses a method to calculate and display a division result, and then tells the user
//if the result is even or odd.
import java.util.Scanner; //Importing the Java scanner.

public class Discussion6 { //Creating the class.
	
	//Below: Creating method "divideNum" to divide the two numbers.
	static public double divideNum(double num1, double num2) {
		double result= (num1/num2); //Storing the division result inside variable called result.
		
		return (result); //Making the method return the result.
	}

	public static void main(String[] args) { 
		Scanner numbersToDivide=new Scanner(System.in); //Setting up the scanner.
		
		//Below: Prompting the user for two numbers that could be divided.
		System.out.println("Please enter the two numbers you would like to divide, separated by space:");
		
		double number1=numbersToDivide.nextDouble(); //Storing first number in variable "number1".
		
		double number2=numbersToDivide.nextDouble(); //Storing second number in variable "number2".
		
		double result = divideNum(number1, number2); //Calling "result" variable with method inside.
		
		//Below: Printing out the result.
		System.out.println("The result of your division is"+" "+result);
		
		if (result%2==0) //Setting up an "if" statement to tell if result is even or odd.
			System.out.println("This is an even number.");
		else System.out.println("This is an odd number.");
		
			
			
	}

}
