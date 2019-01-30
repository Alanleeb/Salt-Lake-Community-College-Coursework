package gps;

public class GpsCoordinates {

	private double latitude;
	private double longitude;

	public GpsCoordinates(double lat, double lon) {
		latitude = lat;
		longitude = lon;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String toString() {

		return String.format("%1.6f %1.6f", getLatitude(), getLongitude());

	}
}
