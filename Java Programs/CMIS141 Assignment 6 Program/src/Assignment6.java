/**Name: Kardash, Mark   Date: 12/07/2021
 * This program prompts the user for a number of students, the name of each student, and the score they received on
 * a final exam. It then displays all of the students' names and exam scores. It also displays the names and scores
 * of the students with the highest and lowest exam scores.
 */
import java.util.Scanner; //Importing the Java scanner;
public class Assignment6 { //Creating the class.

	public static int indexOfSmallest(int studentScores[], int numberOfStudents) { //Method for index of smallest value.
		int indexSmallest=0; //Setting original index to zero, to have something to start with.
		
		int initialValueSmallest=studentScores[0]; //Putting the first array element as the first value to start loop.
		
		//Below: "For" loop to find the index of the smallest value.
		for (int smallestValue=0; (smallestValue<studentScores.length); smallestValue++) {
			if (initialValueSmallest>studentScores[smallestValue]) { //If a new value is smaller than the initial
				initialValueSmallest =studentScores[smallestValue]; //value, we make that the new smallest value.
				indexSmallest =smallestValue;
				}
		}
		return indexSmallest; //Returning the index.
	} //Closing method.
	
	public static int indexOfLargest(int studentScores[], int numberOfStudents) { //Method for index of largest value.
		int indexLargest=0; //Setting index to zero.
		int initialValueLargest=studentScores[0]; //Setting the first array element as the first value to start checking
		//Below: "For" loop for index of largest element.
		for (int largestValue=0; (largestValue<studentScores.length); largestValue++) {
			
			if (initialValueLargest<studentScores[largestValue]) { //If a new value is larger than the initial value,
				initialValueLargest=studentScores[largestValue]; //we make that the new largest value.
				indexLargest=largestValue;
			}
		}
		return indexLargest; //Returning the index.
	}
	public static void main(String[] args) { //Main method.
		Scanner scan= new Scanner(System.in); //Setting up the scanner.
		
		System.out.println("Please enter the total number of students."); //Prompting the user for number of students
		int numberOfStudents=scan.nextInt();
		String[] studentNames=new String[numberOfStudents]; //Creating array for student names.
		
		int[] studentScores=new int [numberOfStudents]; //Creating array for students scores.
		
		for (int count=0; count<numberOfStudents; count++) { //"For" loop for names and scores.
			
			System.out.println("Please enter the name for Student"+" "+(count+1)+":"); //Prompt for name.
			studentNames[count] =scan.next(); //Populating "studentNames" array with each name.
			
			System.out.println("Please enter the exam score for Student"+" "+(count+1)+":"); //Prompt for score.
			studentScores[count]=scan.nextInt(); //Populating "studentScores" array with each score.
		}
		
		for (int finalCount=0; finalCount<numberOfStudents; finalCount++) { //"For" loop to print all names and scores
			System.out.println("Student"+" "+studentNames[finalCount]+" "+"received a score of"+" "+studentScores[finalCount]+" "+"on their final exam.");
		}
		
		//Below: Print statements calling each method IN each array, so that the value or string corresponding to each
		//index with print out.
		System.out.println("The highest score, received by"+" "+studentNames[indexOfLargest(studentScores, numberOfStudents)]+" "+"was:"+" "+studentScores[indexOfLargest(studentScores, numberOfStudents)]);
		
		System.out.println("The lowest score, received by"+" "+studentNames[indexOfSmallest(studentScores, numberOfStudents)]+" "+"was:"+" "+studentScores[indexOfSmallest(studentScores, numberOfStudents)]);
			
		scan.close(); //Closing the scanner.
		
		
		
		
		
	}

}
