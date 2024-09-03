//Name: Kardash, Mark   CMIS141 7381     Date: (11/13/2021)
/*This is a program that prompts the user for the amount of pages in a book, and makes a suggestion
 * on how many pages a day they should read based on the book's length. It then prompts the user
 * for the amount of pages read on a particular day, and, once they have entered that number,
 * calculates the total number of pages they have read so far, along with the percentage of 
 * the book these pages represent. Once the user enters a zero to end the loop, the program
 * displays the amount of pages the user has left to read.
 */
import java.util.Scanner; //Importing the scanner.
public class Discussion4 { //Creating the class.

	public static void main(String[] args) {
		
		//Below: Setting up the scanner for the overall number of pages in the book.
		Scanner numberOfPages=new Scanner(System.in);
		
		//Below: Setting up the scanner for the number of pages the user reads er day.
		Scanner pagesPerDay=new Scanner(System.in);
		
		int dayCounter=1; //Creating the "int" variable "dayCounter" to count each reading day.
		
		/*Below: Creating the "int" variable "pagesSoFar" for the number of pages the user has read
		 * during all of the days
		 */
		int pagesSoFar=0;
		
		/*Below: Creating the "double" variable "percentageOfBook for the percentage the user
		 *  has read so far (We make it "double" so it can later be calculated as a real number).
		 */
		double percentageOfBook; 
		
		/*Below: Creating the "int" variable "pagesLeft" for the amount of pages the user will have
		 * left to read after they finish the input.
		 */
		int pagesLeft; 
		
		int dailyReadingAmount; //Creating "int" variable "dailyReadingAmount" for pages read a day.
		
		//Below: Prompting the user for the total number of pages in the book.
		System.out.print("Please enter the number of pages in your book:");
		int totalPages=numberOfPages.nextInt();
		
		if (totalPages<=100) { //Setting up "if" statements for reading suggestions.
			System.out.println("Suggested reading amount: 15 pages/day.");
		}
		else if (totalPages<=300) {
			System.out.println("Suggested reading amount: 30 pages/day.");
		}
		else if (totalPages>=500)
			System.out.println("Suggested reading amount: 60 pages/day.");
		
		//Below: Prompting the user for the pages read per day.
		System.out.print("Enter the number of pages read per Day"+" "+dayCounter+":");
		dailyReadingAmount=pagesPerDay.nextInt();
		
		while (dailyReadingAmount>0) { //A "while" statement to control the loop (start of block).
			pagesSoFar+=dailyReadingAmount; //Adding the pages read per day to the sum of pages.
			//Below: Calculating the percentage read (after type casting "pagesSoFar" to double.
			percentageOfBook= ((double)pagesSoFar)*100/totalPages;
			dayCounter++; //Increasing the count of the days by 1.
			//Below: Printing the statement with page amount user has read so far.
			System.out.println("Congratulations! You have read"+" "+pagesSoFar+" "+"pages so far!");
			//Below: Printing statement with percentage user has read so far.
			System.out.println("That's"+" "+percentageOfBook+"% of the book!");
			//Below: Prompting user for next day's page amount to keep loop going.
			System.out.print("Enter the number of pages read per Day"+" "+dayCounter+" "+"or 0 to end"+":");
			dailyReadingAmount=pagesPerDay.nextInt();
		} //Closing the block.
		
		pagesLeft=totalPages-pagesSoFar; //Setting the calculation for the pages left to read.
	
		if (pagesSoFar<totalPages) { //An 'if" statement showing pages left, finishing note, error
				System.out.print("You have"+" "+pagesLeft+" "+"pages left to read!");
		}
		else if (pagesSoFar==totalPages) {
			System.out.print("You are finished! Now, onto your next adventure!");
		}
		else System.out.print("That doesn't seem right though. You've read more pages than the book has!");
		
		numberOfPages.close(); //Closing first scanner.
		pagesPerDay.close(); //Closing second scanner.
		}
}		

	


