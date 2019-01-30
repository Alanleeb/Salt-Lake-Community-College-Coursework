package rockpaperscissors;

public class Player extends RPS {

	public Player() {
		super();
	}

	public CHOICE getChoice(CHOICE c) {

		switch (c) {
		case ROCK:
			return CHOICE.ROCK;
		case PAPER:
			return CHOICE.PAPER;
		case SCISSORS:
			return CHOICE.SCISSORS;
		}
		return null;
	}
}
