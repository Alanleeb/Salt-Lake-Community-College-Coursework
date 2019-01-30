/*Aaron Templeton
 * Midterm 1 - CSIS 1410
 * 
 */
package part1;

public class OvenApp {

	public static void main(String[] args) {
		Oven[] ovens = { new MicrowaveOven(2, 1000), new ConvectionOven(3), new MicrowaveOven(1.5, 750) };

		for (Oven o : ovens) {
			if (o instanceof MicrowaveOven) {
				System.out.println(o);
				((MicrowaveOven) o).autoDefrost();
				System.out.println();
			} else {
				System.out.println(o);
				System.out.println();
			}
		}

	}

}
