/**A program to ask for, and multiply 2 numbers together*/
import java.util.Scanner;
public class PracticeExercises2 {
	public static void main(String[] args) {
		Scanner scanint = new Scanner(System.in);
		System.out.println("Please Enter the First Number:");
		int num1=scanint.nextInt();
		System.out.println("Please Enter the Second Number:");
		int num2=scanint.nextInt();
		System.out.println(" ");
		int result=num1*num2;
		System.out.println("The final result is:"+ result);
		System.out.print(" ");
		//A program that prompts user for two integers, increments them by one, and returns them to the console
		System.out.println("Please Enter 2 Variables Separated by a Space:");
		int digit1=scanint.nextInt(); int digit2=scanint.nextInt();
		digit1++; digit2++;
		System.out.println("After incrementation, the two values became"+ " "+ digit1 +" "+ digit2);
		
		//A program which prompts the user for a sentence and prints it back to the console
		Scanner scanstr = new Scanner(System.in);
		System.out.println("Please Enter Your Sentence Below:");
		String sentence=scanstr.nextLine();
		System.out.print(sentence);
		
		scanint.close();
		scanstr.close();
		
		
		

	}

}

