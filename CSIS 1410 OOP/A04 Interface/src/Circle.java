/*
 * Aaron Templeton
 * CSIS 1410
 * A04 - Interface
 * 
 */
public class Circle implements Shape {

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

	@Override
	public double perimeter() {
		return 2 * Math.PI * getRadius();
	}

	@Override
	public double area() {
		return Math.PI * getRadius() * getRadius();
	}
}
