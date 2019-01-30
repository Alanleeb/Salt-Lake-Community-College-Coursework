/*
 * Aaron Templeton
 * CSIS 1410
 * A04 - Interface
 * 
 */
public class Square extends Rectangle implements Shape, Printable {

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
