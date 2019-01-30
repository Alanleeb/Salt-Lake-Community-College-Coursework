
public class InkJetPrinter extends Printer {
	private int remainingCartridge;

	public InkJetPrinter(int sNumber) {
		super(sNumber);
		remainingCartridge = 100;
	}

	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	public void print() {
		if (getRemainingCartridge() > 0) {
			remainingCartridge -= 10;
			System.out.println("InkJetPrinter is printing. remaining cartridge is " + getRemainingCartridge() + "%");
		} else if (getRemainingCartridge() == 0) {
			System.out.println("InkJetPrinter is printing. remaining cartidge is " + getRemainingCartridge() + "%");
		}
	}
}
