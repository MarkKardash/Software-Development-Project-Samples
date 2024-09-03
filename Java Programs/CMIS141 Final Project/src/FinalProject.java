/**Name: Kardash, Mark   Date: 12/14/2021
 * 
 */
import java.util.Scanner; //Importing scanner.
public class FinalProject { //Creating class.
	//Below: Filling the class with attributes.
	public static int numberOfEmployees=0; //Setting initial number of employees to 0.
	public static String[] employeeNames=new String [100]; //Static string for names.
	public static String[] employeeIDs=new String[100]; //Static string for IDs
	public static double[] employeeSalaries=new double [100]; //Static string for salaries.
	public static Scanner scan=new Scanner(System.in); //Setting up scanner.
		
	
	public static void loadData(String employeeNames[], int numberOfEmployees) { //Method to load data,
		
		System.out.println("Please enter the number of employees:"); //Prompting for employee number.
		numberOfEmployees=scan.nextInt();
		for (int count=0; count<numberOfEmployees; count++) {
			System.out.println("Please enter the name for employee "+(count+1)); //Prompting for names.
			employeeNames[count]=scan.next(); 
			System.out.println("Please enter ID for employee "+(count+1)); //Prompting for IDs
			employeeIDs[count]=scan.next(); 
			System.out.println("Please enter the annual salary for employee "+(count+1)); //Prompting for salaries.
			employeeSalaries[count]=scan.nextDouble(); 
		}
		

	}
	
		public static void addEmployee(){ //Method to add employee.
	
			System.out.println("Please enter the name of the new employee:"); //Prompting for name
			employeeNames[numberOfEmployees]=scan.next();
			System.out.println("Please enter the ID of the new employee:"); //Prompting for ID
			employeeIDs[numberOfEmployees]=scan.next();
			System.out.println("Please enter the annual salary for the new employee:"); //Prompting for salary.
			employeeSalaries[numberOfEmployees]=scan.nextDouble();
			numberOfEmployees++;
}
		public static void displayData() { //Method to display employees.
			
			System.out.println("The name of employee "+(numberOfEmployees+1)+" is "+employeeNames[numberOfEmployees]+".Their ID is "+employeeIDs[numberOfEmployees]+" and their annual salary is $"+employeeSalaries[numberOfEmployees]);
			
	   } 
	
		public static void salaryRange () { //Method for salary range.
			System.out.println("Please enter the lowest salary in your range:"); //Prompting for lowest.
			double lowestSalary=scan.nextDouble();
			System.out.println("Please enter the highest salary in your range:"); //Prompting for highest.
			double highestSalary=scan.nextInt();
			
				if (lowestSalary>employeeSalaries[numberOfEmployees]) { //Conditions.
					System.out.println("The employee "+employeeNames[numberOfEmployees]+", with ID "+employeeIDs[numberOfEmployees]+" receives a salary of "+employeeSalaries[numberOfEmployees]);
			}
				else if (highestSalary>employeeSalaries[numberOfEmployees]) {
					System.out.println("The employee "+employeeNames[numberOfEmployees]+", with ID "+employeeIDs[numberOfEmployees]+" receives a salary of "+employeeSalaries[numberOfEmployees]);
		
		}
	}
		public static void getData() { //Method to retrieve specific employee.
			System.out.println("Please enter the ID of the employee you want data about:"); //Prompt for data
			String employeeID=scan.next();
			
			if (employeeIDs[numberOfEmployees].equals(employeeID)) {
				System.out.println("The name of the employee is "+employeeNames[numberOfEmployees]+". Their ID is "+employeeIDs[numberOfEmployees]+". Their annual salary is $"+employeeSalaries[numberOfEmployees]);
				
			}
		}
   
			public static void main(String[] args) { //Main method
				System.out.println("1-Load Employee Data");
				System.out.println("2-Add Employee");
				System.out.println("3-Display Employees");
				System.out.println("4-Locate Employee from ID");
				System.out.println("5-Locate Employee from Salary Range");
				System.out.println("6-Exit");
			
				System.out.println("What would you like to do?"); //Main prompt
				int userSelection=scan.nextInt();
		
				while (userSelection!=6) { //While loop
					if (userSelection==1) { //Condition "if" loop.
						loadData(employeeNames, numberOfEmployees);
					
					}
					else if (userSelection==2) {
						addEmployee();
					
					}
			
					else if (userSelection==3) {
						displayData();
					
				}
					else if (userSelection==4) {
						getData();
					}
					else if (userSelection==5) {
						salaryRange();
				}
					System.out.println("1-Load Employee Data");
					System.out.println("2-Add Employee");
					System.out.println("3-Display Employees");
					System.out.println("4-Locate Employee from ID");
					System.out.println("5-Locate Employee from Salary Range");
					System.out.println("6-Exit");
				
					System.out.println("What would you like to do?");
					userSelection=scan.nextInt();
			
			
		}
					System.out.println("Thank you for using our program. Have a great day!");	
	
	}

}
