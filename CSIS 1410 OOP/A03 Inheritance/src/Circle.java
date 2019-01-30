/*Aaron Templeton
 * A03 - Inheritance
 * CSIS 1410
 */
public class Circle {

	private int radius;

	public Circle(int r) {
		radius = r;
	}

	public int diameter() {
		int d = getRadius() * 2;
		return d;
	}

	public double circumference() {
		double c = Math.PI * 2 * getRadius();
		return c;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Circle(" + getRadius() + ")";
	}
}
