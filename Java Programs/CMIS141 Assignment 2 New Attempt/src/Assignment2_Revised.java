import java.util.Scanner;

public class Assignment2_Revised {

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
		
		
		//Below: Prompting the user for the operation symbol.
		System.out.print("Please enter the operation symbol(+, -, *, or /):"); 
		operationSymbol = scan.next().charAt(0); //Storing the operation symbol in its variable.
		
		//Below: Getting the program to print out the inputs.
		System.out.println("The inputs are:" +" "+num1+" "+ num2+" "+ operationSymbol); 
		
		/*Below: //Setting up the "if" statements for the operation symbol possibilities, 
		 * and error message.
		 */
		if (operationSymbol=='+')
			System.out.println("The result is:"+(num1+num2));
		else if (operationSymbol=='-')
		    System.out.println("The result is:"+(num1-num2));
		else if (operationSymbol=='*')
			System.out.println("The result is:"+(num1*num2));
		else if (operationSymbol=='/')
			System.out.println("The result is:"+(num1/num2));
		else System.out.print("Invalid operation symbol. Please try again.");//Concluding the "if" statements by typing error message
		scan.close(); //Closing the scanner.
	}

}
