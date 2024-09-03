//Name: Kardash, Mark     CMIS141 7381     Date:(12/04/2021)
//The purpose of this program is to prompt the user for 5 product prices, and then output 
//the prices after a 10% discount is applied to them.
import java.util.Scanner; //Importing the Java scanner.
public class Discussion7 { //Creating the class.
	
	//Below: Creating the method to calculate prices after discount.
	public static void applyDiscount (double listOfPrices[]) {
		for (int i=0; (i<listOfPrices.length); i++) { //Setting "for" loop for calculation. 
			double productPrice=listOfPrices[i]-listOfPrices[i]*10/100;
			System.out.println(productPrice);
		}

	}
		
	public static void main(String[] args) { //Main method.
		Scanner scan = new Scanner(System.in); //Setting up the scanner.
		double listOfPrices[]=new double [5]; //Creating array to store prices. 
		System.out.println("Please input five of your product prices:"); //Prompting user for prices.
		listOfPrices[0]=scan.nextDouble(); //Populating array with prices.
		listOfPrices[1]=scan.nextDouble();
		listOfPrices[2]=scan.nextDouble();
		listOfPrices[3]=scan.nextDouble();
		listOfPrices[4]=scan.nextDouble();
		
		//Below: Statement for outputting the result.
		System.out.println("With the 10% discount, your items will cost the following:");
		applyDiscount(listOfPrices);
		
scan.close(); //Closing the scanner.
	}

}
