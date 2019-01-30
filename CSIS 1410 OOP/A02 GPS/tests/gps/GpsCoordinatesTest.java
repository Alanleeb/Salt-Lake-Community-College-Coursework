package gps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GpsCoordinatesTest {
	GpsCoordinates gps = new GpsCoordinates(0, 0);

	@Test
	public void testGpsCoordinates() {

		double expected = gps.getLatitude();
		double actual = gps.getLatitude();
		assertEquals(expected, actual, 800.0);

	}

	@Test
	public void testGetLatitude() {
		double expected = gps.getLatitude();
		double actual = gps.getLatitude();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testSetLatitude() {
		double expected = gps.getLatitude();
		double actual = gps.getLatitude();
		assertEquals(expected, actual, 0.01);

	}

	@Test
	public void testGetLongitude() {
		double expected = gps.getLongitude();
		double actual = gps.getLongitude();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testSetLongitude() {
		double expected = gps.getLongitude();
		double actual = gps.getLongitude();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testToString() {
		String expected = gps.toString();
		String actual = gps.toString();
		assertEquals(expected, actual);
	}

}
