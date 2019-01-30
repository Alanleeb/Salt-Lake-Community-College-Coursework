import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
	public static void main(String[] args) {
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %.1f = %.1f", digit, result);
		} catch (Exception e) {
			System.out.println("a error occured");
			System.out.println(e.getMessage());
		}
	}

	private static int numberFromUser() {

		Scanner input = new Scanner(System.in);
		boolean done = false;
		int number = 0;
		do {
			try {
				System.out.print("number: ");
				number = input.nextInt();
				done = true;

			} catch (InputMismatchException e) {
				System.out.println("enter a whole number");
				input.nextLine();
			}
		} while (!done);
		input.close();
		return number;

	}

	private static int sevenModulusN(int number) {
		if (number == 0) {
			throw new IllegalArgumentException("cannot get 7 % 0");
		}
		return 7 % number;
	}
}
