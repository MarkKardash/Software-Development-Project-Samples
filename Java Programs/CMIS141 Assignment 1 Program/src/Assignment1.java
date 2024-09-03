/*Author Name (Last, First): Kardash, Mark 
 * Class and Section: CMIS 141 7381 
 * Date: 10/29/2021
 *A program that calculates students' new overall GPA based on their student ID, current GPA, current credits, overall GPA, and 
	 * overall credits
	 */
import java.util.Scanner; //importing the Java scanner
public class Assignment1 {
	public static void main(String[] args) { //Establishing the "main"
			Scanner scanint = new Scanner(System.in); //Setting scanner variable, "scanint", for the credits.
			Scanner scanstr = new Scanner(System.in); //Setting scanner variable, "scanstr", for the Student ID.
			Scanner scanfloat = new Scanner(System.in); //Setting scanner variable, "scanfloat", for the GPA.
			System.out.println("Please enter your Student ID number:"); //Print statement prompting for Student ID Number.
			String studentId=scanstr.nextLine(); // Setting string variable "studentId" to correspond with the prompt.
			System.out.println("Please enter your current class grade (GPA):"); //Setting a prompt asking the student for current GPA.
			float currentGPA=scanfloat.nextFloat(); //Setting float variable "currentGPA", since it will be a decimal.
			System.out.println("Please enter your current number of credits:"); //Prompting the user for the current number of credits.
			int currentCredits=scanint.nextInt(); //Setting integer variable "currentCredits" to complete the above prompt.
			System.out.println("Please enter your overall class grade (GPA):"); //Prompting the user for their overall GPA.
			float overallGPA=scanfloat.nextFloat(); //Setting float variable "overallGPA" for the above calculation.
			System.out.println("Please enter your overall number of credits:"); //Prompting the user for the overall number of credits.
			int overallCredits=scanint.nextInt(); //Setting integer variable "overallCredits".
			//(Below:) Storing all calculations necessary to get a new overall GPA in a float variable, "newOverallGPA".
			float newOverallGPA= ((currentGPA*currentCredits)+(overallGPA*overallCredits))/(currentCredits+overallCredits);
			//(Below:) Entering print statements for all of our input, including the New Overall GPA.
			System.out.println("Your Student ID number is:"+" "+studentId);
			System.out.println("Your current class grade (GPA) is:"+" "+currentGPA);
			System.out.println("Your current number of credits is:"+" "+currentCredits);
			System.out.println("Your overall class grade (GPA) is:"+" "+overallGPA);
			System.out.println("Your overall number of credits is:"+" "+overallCredits);
			System.out.print("Your New Overall GPA is:"+" "+newOverallGPA);
			//Finally,close all scanners.
			scanint.close();
			scanstr.close();
			scanfloat.close();	
	}

}
