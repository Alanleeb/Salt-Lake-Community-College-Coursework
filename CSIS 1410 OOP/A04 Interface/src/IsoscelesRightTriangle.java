/*
 * Aaron Templeton
 * CSIS 1410
 * A04 - Interface
 * 
 */
public class IsoscelesRightTriangle implements Shape, Printable {

	private int leg;

	public IsoscelesRightTriangle(int l) {
		leg = l;
	}

	public double hypotenuse() {
		double h = Math.hypot(getLeg(), getLeg());
		return h;
	}

	public int getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + getLeg() + ")";
	}

	@Override
	public void print() {
		for (int i = 1; i <= getLeg(); i++) {

			for (int j = 1; j <= i; j++) {

				if (i == 1 || i == getLeg()) {
					System.out.print("o ");
				} else if (j == 1 || j == getLeg()) {
					System.out.print("o ");
				} else if (j == i) {
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	@Override
	public double perimeter() {
		return (getLeg() * 2) + Math.hypot(getLeg(), getLeg());
	}

	@Override
	public double area() {
		return (getLeg() * getLeg()) / 2;
	}
}
