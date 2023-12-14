// IMPORT UTILITIES
import java.util.Scanner;																				
import java.util.ArrayList;
import java.util.Random;

// START
public class criticalThinking5 {																		
	public static void main(String[] args) {
		
		// Initialize Random and Scanner objects																								
		Random rd = new Random();
		Scanner scr = new Scanner(System.in);
		
		// Declare variables																								
		String response;
		
		boolean programStart = true;
		
		int i = 0;
		
		double weekAvg = 0;
		double minTemp = 40;
		double  maxTemp = 99;
		
		double randomTemp1 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp2 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp3 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp4 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp5 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp6 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		double randomTemp7 = rd.nextDouble(maxTemp - minTemp + 1) + minTemp;
		
		// Days of the week ArrayList																								
		ArrayList<String> daysOfWeek = new ArrayList<String>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		
		// Random daily temperatures ArrayList																								
		ArrayList<Double> tempsOfWeek = new ArrayList<Double>();
		tempsOfWeek.add(randomTemp1);
		tempsOfWeek.add(randomTemp2);
		tempsOfWeek.add(randomTemp3);
		tempsOfWeek.add(randomTemp4);
		tempsOfWeek.add(randomTemp5);
		tempsOfWeek.add(randomTemp6);
		tempsOfWeek.add(randomTemp7);
		
		// Iterate through random daily temperatures to calculate weekly average temperature																								
		for (i = 0; i < tempsOfWeek.size(); i++) {
			weekAvg += tempsOfWeek.get(i);
		}
		
		weekAvg = (weekAvg / 7);
		
		// Begin interactive while-loop structure																								
		while (programStart == true) {
			System.out.println("To retrieve the daily average temperature, enter a weekday ('Monday - Sunday')...");
			System.out.println("Or enter ('Week') to retrieve the weekly average temperature:");
			
			response = scr.next();
			
			// Switch statement for handling user response(s)																							
			switch (response) {
				
				case "sunday":
				case "Sunday":
					System.out.printf("The daily average temperature for Sunday is: %.2f\u00B0 F", tempsOfWeek.get(0));
					break;
				
				case "monday":
				case "Monday":
					System.out.printf("The daily average temperature for Monday is: %.2f\u00B0 F", tempsOfWeek.get(1));
					break;
					
				case "tuesday":
				case "Tuesday":
					System.out.printf("The daily average temperature for Tuesday is: %.2f\u00B0 F", tempsOfWeek.get(2));
					break;
				
				case "wednesday":
				case "Wednesday":
					System.out.printf("The daily average temperature for Wednesday is: %.2f\u00B0 F", tempsOfWeek.get(3));
					break;
					
				case "thursday":
				case "Thursday":
					System.out.printf("The daily average temperature for Thursday is: %.2f\u00B0 F", tempsOfWeek.get(4));
					break;
					
				case "friday":	
				case "Friday":
					System.out.printf("The daily average temperature for Friday is: %.2f\u00B0 F", tempsOfWeek.get(5));
					break;
					
				case "saturday":
				case "Saturday":
					System.out.printf("The daily average temperature for Saturday is: %.2f\u00B0 F", tempsOfWeek.get(6));
					break;
					
				case "week":
				case "Week":
					System.out.println("The daily average temperatures for each day this week are as follows: ");
					System.out.println();
					System.out.printf("\tSunday: %.2f\u00B0 F%n", tempsOfWeek.get(0)); 
					System.out.printf("\tMonday: %.2f\u00B0 F%n", tempsOfWeek.get(1));
					System.out.printf("\tTuesday: %.2f\u00B0 F%n", tempsOfWeek.get(2)); 
					System.out.printf("\tWednesday: %.2f\u00B0 F%n", tempsOfWeek.get(3)); 
					System.out.printf("\tThursday: %.2f\u00B0 F%n", tempsOfWeek.get(4)); 
					System.out.printf("\tFriday: %.2f\u00B0 F%n", tempsOfWeek.get(5)); 
					System.out.printf("\tSaturday: %.2f\u00B0 F%n", tempsOfWeek.get(6)); 
					System.out.println();
					System.out.printf("The weekly average temperature is: %.2f\u00B0 F", weekAvg);
					break;
					
				default:
					System.out.println("Data not found. Please try again...");
					break;
			}
			
			// System output messages																							
			System.out.println();
			System.out.println();
			System.out.println("Would you like to choose another day of the week?");
			System.out.println("Press Y for yes or N for no:");
			
			// Continue or terminate program decision branches																							
			response = scr.next();
			
			if (response.equals("Y") || response.equals("y")) {
				programStart = true;
			} else {
				programStart = false;
				System.out.println("Goodbye.");
			}
		
		// End interactive while-loop structure	
		} 																								
		
		// Close Scanner object
		scr.close();
	}
	
// END	
}			