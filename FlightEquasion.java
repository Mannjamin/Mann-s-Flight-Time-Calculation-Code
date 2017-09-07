public class FlightEquasion {
	
	/* 
	 * Mann's Basic Flight Time Calculator:
	 *  
	 * Assumptions:
	 * # You know the departure time and arrival time. 
	 * # The flight will be direct with no stops.
	 * # You know the time differentiation.
	 * 
	 * 
	 * How It Works:
	 * # This basic flight time calculator takes the departure and arrival times. 
	 * # It will take the Hours, Multiply them by 60 and add them to the Minutes formulating a value.
	 * # The "Local Arriving Time" is calculated by Adding the Arrival Time and the time difference multiplied by 60.
	 * # This is done like this "A + (B * 60)".
	 * # The "Time Difference" is calculated by subtracting the Depart Time from the Local Arriving Time.
	 * # Applying a Modulo of 60 to the Time Difference will give you the Minutes Value. 
	 * # The Calculation "(Time Difference - Minutes) / 60" will give you the Hours Value. 
	 * # Adding the Hours and Minutes together will give you the flight time between two locations.
	 * 
	 * Functionality:
	 * This Flight Time Calculator is capable of:
	 * # Calculating a Flight Time if the Arrival Time is the next day.
	 * # # To do this, you will need to change the Arrival Time Calculation as follows:
	 * # # # "Arrival Time = (Arrival Hours + 24) * 60 + Arrival Minutes)"
	 * # Calculating the Flight time in a positive time difference. 
	 * # # To do this, you will need to change the Local Arrival Time Calculation as follows:
	 * # # # Local Arriving Time = "Arrival Time - (time difference * 60)"
	 * 
	 */
	
	//Variables
	public static String departPlace = "Place 1";
	public static String arrivalPlace = "Place 2";
	public static int departHours = 00;
	public static int departMinutes = 00;
	public static int arrivalHours = 00;
	public static int arrivalMinutes = 00;
	public static int timeDiff = 0;
	public static int localArrivalTime;
	public static int departTime;
	public static int arrivalTime;
	public static int timeDifference;
	public static int result2;
	public static int resultHH;
	public static int resultMM;
	
	public static void main(String [] args)
	{	
		departTime = (departHours * 60 + departMinutes);
		System.out.println("Depart Time Value: " + departTime);
		
		arrivalTime = (arrivalHours * 60 + arrivalMinutes);
		System.out.println("Arrival Time Value: " + arrivalTime);
		
		localArrivalTime = (arrivalTime - (timeDiff * 60));
		System.out.println("Local Arrival Time Value: " + localArrivalTime);
		
		timeDifference = localArrivalTime - departTime;
		System.out.println("Time Difference Value: " + timeDifference);
		
		resultMM = timeDifference % 60;
		System.out.println("Minutes Value: " + resultMM + " Minutes.");
		
		resultHH = (timeDifference - result2) / 60;
		System.out.println("Hours Value: " + resultHH + " Hours.");
		
		System.out.println("Your flight from " + departPlace + " to " + arrivalPlace + " will take " + resultHH + " Hours and " + resultMM + " Minutes.");
    }
}
