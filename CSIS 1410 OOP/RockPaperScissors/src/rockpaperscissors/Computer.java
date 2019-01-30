package rockpaperscissors;

import java.util.Random;

public class Computer extends RPS {
	private Random rand = new Random();

	public Computer() {
		super();
	}

	public CHOICE getChoice() {

		int choice = rand.nextInt(3);

		switch (choice) {
		case 1:
			return CHOICE.ROCK;
		case 2:
			return CHOICE.PAPER;

		}
		return CHOICE.SCISSORS;

	}
}
