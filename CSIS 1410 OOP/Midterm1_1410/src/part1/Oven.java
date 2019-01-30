/*Aaron Templeton
 * Midterm 1 - CSIS 1410
 * 
 */
package part1;

public class Oven {

	private double size;

	public Oven(double s) {
		size = s;
	}

	public void heatFood() {

	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + "size: " + size + "ft\u00B3";
	}

}