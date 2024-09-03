//Name: Kardash, Mark    Date: 11/06/2021
//A program that calculates simple mathematical expressions. Can possibly be used by elementary/middle school students.
import java.util.Scanner; //Importing the scanner
public class Assignment2 { //Creating the class

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //Setting up the scanner
		double num1; //Setting up double variable Num1 for the first number
		double num2; //Setting up double variable "Num2" for the second number
		char operationSymbol; //Setting up character variable "Symbol" for the operation symbol
		
		//Below: Prompting the user for two numbers separated by space.
		System.out.print("Please enter the numbers (Separated by space) to be used for the expression:");
		
		//Below: Storing the numbers in the variables. 
		num1 = scan.nextDouble(); 
		num2 = scan.nextDouble();
		double sum=num1+num2; //Setting the double variable "sum" for the addition result
		double difference=num1-num2; //Setting the double variable "difference" for the subtraction
		double product=num1*num2;//Setting the double variable "product" for the multiplication
		double quotient=num1/num2;//Setting the double variable "quotient" for the division
		
		//Below: Prompting the user for the operation symbol.
		System.out.print("Please enter the operation symbol(+, -, *, or /):"); 
		operationSymbol = scan.next().charAt(0); //Storing the operation symbol in its variable.
		
		//Below: Getting the program to print out the inputs.
		System.out.println("The inputs are:" +" "+num1+" "+ num2+" "+ operationSymbol); 
		
		/*Below: //Setting up the "if" statements for the operation symbol possibilities, 
		 * and error message.
		 */
		if (operationSymbol=='+')
			System.out.println("The result is:"+sum);
		else if (operationSymbol=='-')
		    System.out.println("The result is:"+difference);
		else if (operationSymbol=='*')
			System.out.println("The result is:"+product);
		else if (operationSymbol=='/')
			System.out.println("The result is:"+quotient);
		else System.out.print("Invalid operation symbol. Please try again.");//Concluding the "if" statements by typing error message
		scan.close(); //Closing the scanner.		
	}

}
