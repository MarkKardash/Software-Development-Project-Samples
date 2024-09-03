import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
System.out.print ("Please enter your desired number of rows:");
int rowNumber = scan.nextInt();

for (int row=1; row<=rowNumber; row++) {
	for (int column=1; column<=row; column++) {
			System.out.print("# ");
			
}
System.out.println();
	
		
	}
System.out.print("Please enter your desired side length:");
int sideLength=scan.nextInt();
int spaces=sideLength-1;

for	 (int rowLength=1; rowLength<=sideLength; rowLength++) {
	for (int columnLength=1; columnLength<=sideLength-1; columnLength--) {
		if ((rowLength<=sideLength && columnLength==sideLength-rowLength+1 || columnLength == sideLength+rowLength-1)
				|| (rowLength>=sideLength && columnLength==rowLength-sideLength+1|| columnLength==2*sideLength-(rowLength-sideLength+1)))
			System.out.print("#");
	}
	
	}
	}
}
	                                                             
	