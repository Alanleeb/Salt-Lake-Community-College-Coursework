/*Aaron Templeton
 * A03 - Inheritance
 * CSIS 1410
 */
public class IsoscelesRightTriangle {

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
}
