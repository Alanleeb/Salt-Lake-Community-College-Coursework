/*Aaron Templeton
 * A03 - Inheritance
 * CSIS 1410
 */
public class Square extends Rectangle {

	public Square(int l) {
		super(l, l);

	}

	public int getSide() {
		return super.getLength();
	}

	@Override
	public String toString() {
		return "Square (" + super.getLength() + ")";
	}
}
