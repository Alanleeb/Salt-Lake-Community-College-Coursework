package part2;

public class ExcerciseApp {

	public static void main(String[] args) {

		String[] bikes = { "mountain", "city", "road", "kids" };
		StringBuilder sb = new StringBuilder();
		sb.append("Particpants Brought ");
		int count = 0;
		for (String b : bikes) {
			if (count == bikes.length - 1) {
				sb.append("- even ").append(b).append(" bikes");
			} else {
				sb.append(b).append(" bikes and ");
			}
			count++;
		}
		System.out.println(sb);

	}

}
