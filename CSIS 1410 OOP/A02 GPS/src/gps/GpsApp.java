package gps;

public class GpsApp {

	public static void main(String[] args) {
		GpsCoordinates gps = new GpsCoordinates(40.760671, -111.891122);
		System.out.println("GPS Coordinates of SLC: " + gps);
		Gps slc = new Gps("MyGps", gps);
		System.out.println(slc);

		slc.updatePosition();
		System.out.println("position update1: " + slc.getPosition());
		slc.updatePosition();
		System.out.println("position update2: " + slc.getPosition());
		slc.updatePosition();
		System.out.println("position update3: " + slc.getPosition());

	}

}
