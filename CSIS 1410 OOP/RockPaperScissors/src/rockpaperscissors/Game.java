package rockpaperscissors;

import java.net.URL;

import javax.swing.ImageIcon;

public class Game extends RPS {

	private CHOICE playerChoice;
	private CHOICE computerChoice;
	private Player player;
	private Computer computer;
	private RESULT result;
	private CHOICE c;
	private static int win = 0;
	private static int loss = 0;

	public void setPlayerChoice(CHOICE e) {
		c = e;

	}

	public CHOICE getPlayerChoice() {
		return c;
	}

	public Game() {
		super();
		player = new Player();
		computer = new Computer();
	}

	// gets computer and player choices
	public void play() {
		playerChoice = player.getChoice(this.getPlayerChoice());
		computerChoice = computer.getChoice();

	}

	public CHOICE getCompChoice() {
		return computerChoice;
	}

	// gets image icon for computer
	public URL getComputerIcon() {
		URL pcImage = null;

		if (computerChoice == CHOICE.ROCK) {
			pcImage = ImageIcon.class.getResource("/images/Rock.png");
		} else if (computerChoice == CHOICE.PAPER) {
			pcImage = ImageIcon.class.getResource("/images/Paper.png");
		} else {
			pcImage = ImageIcon.class.getResource("/images/Scissors.png");
		}
		return pcImage;
	}

	// gets image icon for player
	public URL getPlayerIcon() {
		URL pImage = null;

		if (playerChoice == CHOICE.ROCK) {
			pImage = ImageIcon.class.getResource("/images/Rock.png");
		} else if (playerChoice == CHOICE.PAPER) {
			pImage = ImageIcon.class.getResource("/images/Paper.png");
		} else {
			pImage = ImageIcon.class.getResource("/images/Scissors.png");
		}
		return pImage;
	}

	// gets game results
	public RESULT getResult() {

		if (playerChoice == computerChoice) {
			return RESULT.TIE;
		}

		switch (playerChoice) {
		case ROCK:
			return (computerChoice == CHOICE.SCISSORS ? RESULT.WIN : RESULT.LOSE);
		case PAPER:
			return (computerChoice == CHOICE.ROCK ? RESULT.WIN : RESULT.LOSE);
		case SCISSORS:
			return (computerChoice == CHOICE.PAPER ? RESULT.WIN : RESULT.LOSE);
		}

		return null;
	}

	// gets wins and losses from get result method above
	public void getCount() {
		if (getResult() == RESULT.WIN) {
			win++;
		} else if (getResult() == RESULT.LOSE) {
			loss++;
		}

	}

	public int getWins() {
		return win;
	}

	public int getLoss() {
		return loss;
	}

	// resets game
	public void reset() {
		playerChoice = null;
		computerChoice = null;
		c = null;
	}

	// get win or lose image
	public URL getWinOrLoseImage() {
		URL image = null;
		if (this.getResult() == RESULT.WIN) {
			image = ImageIcon.class.getResource("/images/win.png");
			return image;
		} else if (this.getResult() == RESULT.LOSE) {
			image = ImageIcon.class.getResource("/images/lose.png");
			return image;
		} else {
			image = ImageIcon.class.getResource("/images/tie.png");
			return image;
		}
	}

}
