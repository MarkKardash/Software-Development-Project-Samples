import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.print("Please enter two even integer values (Separated by space:");
		int value1=scan.nextInt();
		int value2=scan.nextInt();

		int count3 = value1+2;
		while (count3 < value2) {
			System.out.println(count3);
			count3+=2;
			scan.close();		
	}

}
}