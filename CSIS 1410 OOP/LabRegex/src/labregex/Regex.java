package labregex;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {

		String myRegex1 = "CS\\d{4}";
		// words that start with uppercase A
		String r2 = "A\\w+";
		// words with Uppercase vowels
		String r3 = "[|A|E|I|O|U|}]\\w+";
		// word with uppercase vowels and atleast two letters long
		String r4 = "[|A|E|I|O|U|}]\\w{1,}";
		// phone number xxx-xxx-xxxx
		String r5 = "^(\\d{3}-\\d{3}-\\d{4})*$";
		// emails
		String r6 = "^[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})$";
		test(r6);
	}

	public static void test(String regex) {
		String word;
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter words to match the expression %s%n", regex);
		System.out.println("Enter DONE when you are finished");
		System.out.print("Word: ");
		word = input.nextLine();

		while (!word.equalsIgnoreCase("done")) {
			System.out.printf("%s %s%n", word, word.matches(regex) ? "matches" : "does not match");
			System.out.print("Word: ");
			word = input.nextLine();
		}

	}
}
