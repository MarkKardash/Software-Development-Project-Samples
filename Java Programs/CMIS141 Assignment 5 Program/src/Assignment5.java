//Name: Kardash, Mark   Date: 11/30/2021
import java.util.Scanner; //Import the Java scanner.

public class Assignment5 { //Create the class.
	
	//Below: Create a method to convert weight from pounds to kilograms.
	public static double convertWeight (double weightInPounds) {
		double convertedWeight=weightInPounds*0.45; //Storing formula in variable "convertedWeight".
		return convertedWeight; //Returning the variable.
	}
	//Below: Creating a method to convert height from inches to centimeters.
	public static double convertHeight (double heightInInches) {
		double convertedHeight=heightInInches*2.54; //Storing formula in variable "convertedHeight".
		return convertedHeight; //Returning the variable.
	}
	//Below: Creating a method to calculate BMI.
	public static double findBMI(double weightInKg, double heightInCM) {
		double BMI=weightInKg/heightInCM/heightInCM*10000; //Storing formula in variable "BMI".
		return BMI; //Returning the variable.
	}
	//Below: Creating an extra method to display the option menu, so as not to clutter the program.
	public static void digitSelectionMenu() {
		System.out.println("Digit Selection Instructions:");
		System.out.println("1-Convert Pounds to Kilograms.");
		System.out.println("2-Convert height in inches to centimeters.");
		System.out.println("3-Calculate Body Mass Index");
		System.out.println("4-Exit program.");
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); //Setting up the scanner.
		
		digitSelectionMenu();
		System.out.println("Welcome! What would you like to do?"); //Prompting user for action.
		int userDecision= scan.nextInt(); //Storing reply in "userDecision" variable.
		
		//Below: I decided to include the exit statement both in the beginning and at the end
		//so that the user could see the exit message even if "4" would be their first option.
		//Otherwise it won't display the first time.
		if (userDecision==4)
			System.out.println("Thank you for using our program! Have a great day!");
		
		while (userDecision!=4) { //Setting up a "while" loop to handle all other options.
			if (userDecision==1) { //An "if" loop for weight.
				System.out.println("Please enter the weight you want converted:");
				double weightInPounds=scan.nextDouble(); //Storing input in "weightInPounds".
				convertWeight (weightInPounds); //Calling method.
				
				//Below: Outputting weight.
				System.out.println("Your converted weight is:"+" "+convertWeight (weightInPounds)+ " "+"Kg");
				digitSelectionMenu(); //Calling method to display menu.
				System.out.println(); //Space for separation of next loop.
				
				System.out.println("Welcome! What would you like to do?"); //Repeating the loop.
				userDecision= scan.nextInt();
			}
			if (userDecision==2) { //"If" loop for height.
				System.out.println("Please enter the height you want converted:"); //Prompt for height.
				double heightInInches=scan.nextDouble(); //Store height in "heightInInches" variable.
				convertHeight(heightInInches); //Calling method.
				
				//Below: Outputting height.
				System.out.println("Your converted height is"+" "+convertHeight(heightInInches)+" "+"centimeters");
				digitSelectionMenu(); //Calling method to display menu.
				
				System.out.println(); //Space for separation of next loop.
				System.out.println("Welcome! What would you like to do?"); //Repeating loop.
				userDecision= scan.nextInt();
			}
			if (userDecision==3) { //"If" loop for BMI.
				//Below: Prompting for weight (in Kg) and height (in CM)
				System.out.println("Please enter your weight (in Kg) and height (in CM) with space:");
				double weightInKg=scan.nextDouble(); //Storing weight in "weightinKg" variable
				double heightInCM=scan.nextDouble(); //Storing height in "heightInCM" variable
				
				double BMI=findBMI(weightInKg, heightInCM); //Calling method (Storing in variable)
				System.out.println("Your Body Mass Index is"+" "+BMI); { //Displaying BMI
					if (BMI>30) //Creating "if" loop for categories. 
						System.out.println("You are in the Obese category.");
					else if (BMI>25) 
						System.out.println("You are in the Overweight category.");
					else if (BMI<18.5) 
						System.out.println("You are in the Underweight category.");
					else if (BMI>18.5) 
						System.out.println("You are in the Normal category.");
					
					digitSelectionMenu(); //Calling menu method.
					
					System.out.println(); //Space for separation of next loop.
					
					System.out.println("Welcome! What would you like to do?"); //Repeating loop.
					userDecision= scan.nextInt();
					
				}
				
				}
			if (userDecision==4) //Repeating exit condition, to display at all times.
				System.out.println("Thank you for using our program! Have a great day!");
			
			
					
	}
		scan.close(); //Closing scanner.
}
}
