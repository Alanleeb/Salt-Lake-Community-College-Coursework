import java.util.ArrayList;
import java.util.Scanner;

public class Itinerary {

	public static void main(String[] args) {

		ArrayList<String> itinerary = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		StringBuilder travelPlan = new StringBuilder();
		String dest;
		boolean done = false;
		int count = 0;

		System.out.println("Please enter destination or 'done' to finish");
		System.out.print("Destination: ");

		dest = input.nextLine();

		while (!(dest.equalsIgnoreCase("done"))) {
			itinerary.add(dest);
			System.out.print("Destination: ");
			dest = input.nextLine();
		}

		for (String el : itinerary) {
			count++;
			if (count == 1) {
				travelPlan.append(el.toUpperCase());
			} else {
				travelPlan.append(" to ").append(el.toUpperCase());
			}

		}
		System.out.println("Travel Route: ");
		System.out.println(travelPlan);

	}

}
