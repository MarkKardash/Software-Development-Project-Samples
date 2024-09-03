import java.util.Scanner;
public class PracticeExercises4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num=scan.nextInt();
		int counter1=1;
		int counter2;
		
		while (counter1<=num) {
			counter2=1;
			while (counter2 <= counter1) {
				System.out.print(counter2+" ");
				counter2++;
			}
			System.out.println();
			counter1++;
			
		}
			
			System.out.print("Please enter two even integer values (Separated by space:");
			int value1=scan.nextInt();
			int value2=scan.nextInt();
	
			int count3 = value1+2;
			while (count3 < value2) {
				System.out.println(count3);
				count3+=2;	
			}
			
			System.out.print("Enter a value: ");
			int number = scan.nextInt();
			int lastNumber = 0;
			
			int backwards = 0;
			while(number >0) {
				lastNumber= number % 10;
				backwards = (backwards*10)+lastNumber;
				number=number/10;
				
			}
			
			
			System.out.println("Reverse value:"+backwards);
			scan.close();
}
}





