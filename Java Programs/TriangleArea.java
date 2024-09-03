/* Made by Conner Fedderson.
 * Discussion 2
 */
import java.util.Scanner;

public class TriangleArea {
//This program will get you the area of a triangle using 1/2*Base*Height.
	
	public static void main(String[] args) {		
		
		//Scanner 'input' made
		Scanner input = new Scanner(System.in); 

		//Set some variables. double so it can include a mix of float's and int's (if I understand that right).
		double base;
		double height;
		double area;
		
		//Set up prompts with the scanner ready to catch.
		System.out.println("Enter the triangle's base: ");
		base = input.nextDouble();
		System.out.println("Enter the triangle's height: ");
		height = input.nextDouble();
		
		//math
		area = (0.5*base*height);
		
		//display inputs and show end result
		System.out.println("Base: "+base);
		System.out.println("Height: "+height);
		System.out.println("=");
		System.out.println("Triangle Area: "+area);
		
		//close scanner. Why do we do this again?
		input.close();
	}

}
