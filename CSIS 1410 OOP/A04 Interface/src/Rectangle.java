/*
 * Aaron Templeton
 * CSIS 1410
 * A04 - Interface
 * 
 */
public class Rectangle implements Shape, Printable {

	private int length;
	private int width;

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle (" + getLength() + "x" + getWidth() + ")";
	}

	@Override
	public void print() {

		for (int i = 0; i < getWidth(); i++) {
			System.out.print("o ");
			for (int j = 0; j < getLength() - 2; j++) {

				if (i == 0 || i == getWidth() - 1) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("o ");
			System.out.println();
		}

	}

	@Override
	public double perimeter() {
		return (2 * getLength()) + (2 * getWidth());
	}

	@Override
	public double area() {
		return getLength() * getWidth();
	}
}
