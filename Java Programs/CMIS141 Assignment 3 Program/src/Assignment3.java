//Name: Kardash, Mark   Date: 11/14/2021
import java.util.Scanner; //Importing the scanner.
public class Assignment3 { //Creating the class.

	public static void main(String[] args) {
		Scanner initialReply=new Scanner(System.in); //Setting the scanner for user's first reply.
		Scanner nameOfStudent=new Scanner(System.in); //Setting the scanner for the student's name.
		Scanner firstAssignmentGrade=new Scanner(System.in); //Setting scanner for Assignment 1.
		Scanner secondAssignmentGrade=new Scanner(System.in); //Setting scanner for Assignment 2.
		Scanner studentExamGrade=new Scanner(System.in); //Setting scanner for Exam grade.
		Scanner studentParticipGrade=new Scanner(System.in); //Setting scanner for Participation grade.
		
		int studentCount=1; //Creating "int" variable "studentCount" to count each student.
		int assignment1Grade; //Creating "int" variable "assignment1Grade" for Assignment 1 grades
		int assignment2Grade; //Creating "int" variable "assignment2Grade" for Assignment 2 grades
		int examGrade; //Creating "int" variable "examGrade" for Exam grades
		int participationGrade; //Creating "int" variable "participationGrade" for participation grades
		 /*Below: Variable "courseGrade" for total course grade. It is "double", so we can get a
		  * real number as a result.
		  */
		double courseGrade;
		String userReply; //Creating string variable "userReply" for user's consent to calculating.
		
		//Below: Prompting the user for whether they want to calculate the student's grade.
		System.out.println("Would you like to calculate the grade for Student"+" "+studentCount+"?:");
		userReply=initialReply.nextLine();
		/*Below: Setting up a "while" loop of prompts for when the user consents (Using "&&"("||")
		 * statement for multiple conditions, counting students with "studentCount").
		 */
		while (userReply.equals("yes") || userReply.equals("Yes") || userReply.equals("YES")) {
			System.out.println("Please enter the student's name:"); //Prompting for student's name.
			String studentName=nameOfStudent.nextLine();
			//Below: Prompting user for student's Assignment 1 grade.
			System.out.println("Please enter the Assignment 1 grade for Student"+" "+studentCount+":"); 
			assignment1Grade=firstAssignmentGrade.nextInt();
			//Below: Prompting user for student's Assignment 2 grade.
			System.out.println("Please enter the Assignment 2 grade for Student"+" "+studentCount+":");
			assignment2Grade=secondAssignmentGrade.nextInt();
			//Below: Prompting user for student's Exam grade.
			System.out.println("Please enter the Exam grade for Student"+" "+studentCount+":");
			examGrade=studentExamGrade.nextInt();
			//Below:Prompting user for student's Participation grade.
			System.out.println("Please enter the Participation grade for Student"+" "+studentCount+":");
			participationGrade=studentParticipGrade.nextInt();
			//Below: Printing out the inputs for all grades of the student.
			System.out.println("The name of Student"+" "+studentCount+" "+"is:"+" "+studentName);
			System.out.println("The Assignment 1 Grade for Student"+" "+studentCount+" "+"is:"+" "+assignment1Grade);
			System.out.println("The Assignment 2 Grade for Student"+" "+studentCount+" "+"is:"+" "+assignment2Grade);
			System.out.println("The Exam Grade for Student"+" "+studentCount+" "+"is:"+" "+examGrade);
			System.out.println("The Participation Grade for Student"+" "+studentCount+" "+"is:"+" "+participationGrade);
			//Below: Calculating the total course grade of the student.
			courseGrade=assignment1Grade*0.25+assignment2Grade*0.25+examGrade*0.4+participationGrade*0.1;
			//Below: Printing out the student's total grade.
			System.out.println("The total course grade for Student"+" "+studentCount+" "+"is:"+" "+courseGrade);
			studentCount++; //Incrementing "studentCount" by 1 for continuous count of students
			//Below: Prompting the user to calculate next student's grade, thus restarting loop.
			System.out.println("Would you like to calculate the grade for Student"+" "+studentCount+"?"+":");
			userReply=initialReply.nextLine();
		} //Closing the loop.
		
		System.out.println("Thank you for using our program!"); //Placing a final exit message.
		
		
		
		
		
			
				
		
		
		initialReply.close(); //Closing "initialReply" scanner.
		nameOfStudent.close(); //Closing "nameOfStudent" scanner.
		firstAssignmentGrade.close(); //Closing "firstAssignmentGrade" scanner.
		secondAssignmentGrade.close(); //Closing "secondAssignmentGrade" scanner.
		studentExamGrade.close(); //Closing "studentExamGrade" scanner.
		studentParticipGrade.close(); //Closing "studentParticipGrade" scanner.	
		}		
			
	}

			
	


