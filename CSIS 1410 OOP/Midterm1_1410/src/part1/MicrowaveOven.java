/*Aaron Templeton
 * Midterm 1 - CSIS 1410
 * 
 */
package part1;

public class MicrowaveOven extends Oven {

	private int power;

	public MicrowaveOven(double s, int p) {
		super(s);
		power = p;

	}

	public void autoDefrost() {
		System.out.println("Defrosting....");
	}

	public void heatFood() {
		System.out.println("heating food using microwaves.");
	}

	public String toString() {
		return super.toString() + " power: " + power + " watts";
	}
}
