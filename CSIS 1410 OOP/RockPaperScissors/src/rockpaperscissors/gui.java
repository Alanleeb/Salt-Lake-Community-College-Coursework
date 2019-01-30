package rockpaperscissors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import rockpaperscissors.RPS.CHOICE;

public class gui extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setResizable(false);
		setTitle("Rock Paper Scissors");
		getContentPane().setBackground(Color.WHITE);

		Game game = new Game();
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.WHITE);
		getContentPane().add(sidePanel, BorderLayout.WEST);
		sidePanel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(60, 60));
		topPanel.setMinimumSize(new Dimension(20, 20));
		topPanel.setBackground(Color.WHITE);
		getContentPane().add(topPanel, BorderLayout.NORTH);

		JLabel lblGame = new JLabel("");
		topPanel.add(lblGame);
		lblGame.setHorizontalTextPosition(SwingConstants.CENTER);
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setForeground(Color.DARK_GRAY);
		lblGame.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 34));

		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(3, 2, 0, 0));

		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setOpaque(true);
		lblPlayer.setBackground(Color.WHITE);
		mainPanel.add(lblPlayer);
		lblPlayer.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setOpaque(true);
		lblComputer.setBackground(Color.WHITE);
		mainPanel.add(lblComputer);
		lblComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputer.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		JLabel lblPlayerimg = new JLabel("");
		lblPlayerimg.setOpaque(true);
		lblPlayerimg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerimg.setBackground(Color.WHITE);
		mainPanel.add(lblPlayerimg);

		JLabel lblCompImg = new JLabel("");
		lblCompImg.setOpaque(true);
		lblCompImg.setBackground(Color.WHITE);
		mainPanel.add(lblCompImg);
		lblCompImg.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel winLabel = new JPanel();
		mainPanel.add(winLabel);
		winLabel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblWins = new JLabel("wins:");
		lblWins.setOpaque(true);
		lblWins.setBackground(Color.WHITE);
		lblWins.setHorizontalAlignment(SwingConstants.RIGHT);
		winLabel.add(lblWins);
		lblWins.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel winCountLbl = new JLabel("0");
		winCountLbl.setOpaque(true);
		winCountLbl.setBackground(Color.WHITE);
		winLabel.add(winCountLbl);
		winCountLbl.setFont(new Font("Tahoma", Font.BOLD, 13));

		JPanel lossLabel = new JPanel();
		mainPanel.add(lossLabel);
		lossLabel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblLosses = new JLabel("losses:");
		lblLosses.setOpaque(true);
		lblLosses.setBackground(Color.WHITE);
		lblLosses.setHorizontalAlignment(SwingConstants.RIGHT);
		lossLabel.add(lblLosses);
		lblLosses.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lossCountLbl = new JLabel("0");
		lossCountLbl.setOpaque(true);
		lossCountLbl.setBackground(Color.WHITE);
		lossLabel.add(lossCountLbl);
		lossCountLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(0, 0));
		panel_1.setMinimumSize(new Dimension(0, 0));
		panel_1.setBackground(Color.WHITE);
		sidePanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		sidePanel.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);

		JButton rockBtn = new JButton("");
		panel.add(rockBtn);
		rockBtn.setBackground(Color.WHITE);
		rockBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rockBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.reset();
				game.setPlayerChoice(CHOICE.ROCK);
				game.play();
				game.getCount();
				lblPlayerimg.setIcon(new ImageIcon(game.getPlayerIcon()));
				lblCompImg.setIcon(new ImageIcon(game.getComputerIcon()));
				lblGame.setIcon(new ImageIcon(game.getWinOrLoseImage()));
				winCountLbl.setText(String.valueOf(game.getWins()));
				lossCountLbl.setText(String.valueOf(game.getLoss()));
			}
		});
		rockBtn.setIcon(new ImageIcon(gui.class.getResource("/images/Rock.png")));

		JButton scissorBtn = new JButton("");
		panel.add(scissorBtn);
		scissorBtn.setBackground(Color.WHITE);
		scissorBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scissorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.reset();
				game.setPlayerChoice(CHOICE.SCISSORS);
				game.play();
				game.getCount();
				lblPlayerimg.setIcon(new ImageIcon(game.getPlayerIcon()));
				lblCompImg.setIcon(new ImageIcon(game.getComputerIcon()));
				lblGame.setIcon(new ImageIcon(game.getWinOrLoseImage()));
				winCountLbl.setText(String.valueOf(game.getWins()));
				lossCountLbl.setText(String.valueOf(game.getLoss()));

			}
		});
		scissorBtn.setIcon(new ImageIcon(gui.class.getResource("/images/Scissors.png")));

		JButton paperBtn = new JButton("");
		panel.add(paperBtn);
		paperBtn.setBackground(Color.WHITE);
		paperBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		paperBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.reset();
				game.setPlayerChoice(CHOICE.PAPER);
				game.play();
				game.getCount();
				lblPlayerimg.setIcon(new ImageIcon(game.getPlayerIcon()));
				lblCompImg.setIcon(new ImageIcon(game.getComputerIcon()));
				lblGame.setIcon(new ImageIcon(game.getWinOrLoseImage()));
				winCountLbl.setText(String.valueOf(game.getWins()));
				lossCountLbl.setText(String.valueOf(game.getLoss()));
			}
		});
		paperBtn.setIcon(new ImageIcon(gui.class.getResource("/images/Paper.png")));

	}

}
