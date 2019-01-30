package gps;

import java.util.Random;

public class Gps {
	private String name;
	private GpsCoordinates position;
	Random rand = new Random();

	public Gps(String n, GpsCoordinates pos) {
		name = n;
		position = pos;
	}

	public void updatePosition() {
		double lat = rand.nextDouble() * 5 - 2.5;
		double lon = rand.nextDouble() * 5 - 2.5;
		position.setLatitude(position.getLatitude() + lat);
		position.setLongitude(position.getLongitude() + lon);

	}

	public GpsCoordinates getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "gps " + position;
	}
}
