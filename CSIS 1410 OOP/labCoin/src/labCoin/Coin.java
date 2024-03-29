package labCoin;

public enum Coin {

	CENT(2.5, 19.05), NICKLE(5.0, 21.21), DIME(2.268, 17.91), QUARTER(5.67, 24.26);

	private final double weight;
	private final double diameter;

	private Coin(double w, double d) {
		this.weight = w;
		this.diameter = d;
	}

	@Override
	public String toString() {
		return this.name() + " w: " + this.weight + " d: " + this.diameter;
	}
}
