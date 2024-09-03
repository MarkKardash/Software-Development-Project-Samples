//Name: Kardash, Mark     CMIS141 7381     Date:(12/10/2021)
//This is a simulator of a washing machine, with working status, time, and other variables.

public class WashingMachine { //Creating class WashingMachine. 
	//Below: Attributes.
	private String machineStatus; //A string for whether the appliance is turned on.
	private int intensity;        //An integer for its intensity, in rmp (rounds per minute).
	private String specialSelection;  //A sort of mode available on washing machines (had to look it up online)
	private int workingTime; //The amount of time the machine will work for. 
	
	//Below: Creating method for appliance
	public void washClothes (String machineStatus, int intensity, String specialSelection, int workingTime) { 
		System.out.println("This is a simulation for a microwave."); //Print statement simply announcing.
		
		//Below: Initiating all variables to current class constructor using "this." method.
		this.machineStatus=machineStatus;
		this.intensity=intensity;
		this.specialSelection=specialSelection;
		this.workingTime=workingTime;
	}
	
	public void results() { //Creating method to display all results.
		System.out.println("The washing machine is currently "+machineStatus);
		System.out.println("The intensity of the washing machine is: " + intensity+ " rpm");
		System.out.println("The special selection is set to "+specialSelection);
		System.out.println("The washing machine will be on for "+workingTime+" "+"minutes");
	}

	

	public static void main(String[] args) { //Main method.
		WashingMachine washingMachine=new WashingMachine(); // Creating the object needed for the results.
		washingMachine.washClothes("on", 747, "Eco Clean 20", 45); //Populating object with the results we want.
		washingMachine.results(); //Finally, displaying the results.
		 
	}
}


