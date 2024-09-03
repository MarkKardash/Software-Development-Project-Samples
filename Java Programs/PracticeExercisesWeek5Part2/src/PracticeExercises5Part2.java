import java.util.Scanner;
public class PracticeExercises5Part2 {

	public static void main(String[] args) {
		Scanner studNum=new Scanner(System.in);
		int number_Of_Students;
		int quiz1,quiz2,quiz3;
		double avg;
		System.out.print("Please enter the number of students:");
		number_Of_Students=studNum.nextInt();
		System.out.println();
		
		for (int studentCount=0; studentCount<number_Of_Students; studentCount++) {
			System.out.println("Student "+(studentCount+1)+" "+"data: ");
			System.out.print("    Enter 3 quiz values separated by space (0-100): ");
			
			quiz1 = studNum.nextInt();
			quiz2 = studNum.nextInt();
			quiz3 = studNum.nextInt();
			
			avg= (quiz1+quiz2+quiz3)/3.0;
			System.out.println("   Quiz Average="+avg);
			System.out.println();
		
		
			
		}
			studNum.close();
		}

	}


