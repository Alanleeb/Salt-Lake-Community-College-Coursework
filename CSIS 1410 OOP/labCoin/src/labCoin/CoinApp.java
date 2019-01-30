package labCoin;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CoinApp extends JFrame {

	public CoinApp() {

		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));

		JPanel coinPanel = new JPanel();
		getContentPane().add(coinPanel);
		coinPanel.setLayout(new GridLayout(0, 4, 0, 0));

		JTextField textArea = new JTextField();
		textArea.setFont(new Font("Tahoma", Font.BOLD, 26));
		textArea.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(textArea);

		JButton btnCent = new JButton("");
		btnCent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(Coin.CENT.toString());
			}
		});
		btnCent.setIcon(new ImageIcon(CoinApp.class.getResource("/images/UsCent.png")));
		coinPanel.add(btnCent);

		JButton btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(Coin.NICKLE.toString());
			}
		});
		btnNickel.setIcon(new ImageIcon(CoinApp.class.getResource("/images/UsNickel.png")));
		coinPanel.add(btnNickel);

		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(Coin.DIME.toString());
			}
		});
		btnDime.setIcon(new ImageIcon(CoinApp.class.getResource("/images/UsDime.png")));
		coinPanel.add(btnDime);

		JButton btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(Coin.QUARTER.toString());
			}
		});
		btnQuarter.setIcon(new ImageIcon(CoinApp.class.getResource("/images/UsQuarter.png")));
		coinPanel.add(btnQuarter);

	}

	public static void main(String[] args) {

		CoinApp ca = new CoinApp();
		ca.setVisible(true);

		for (Coin c : Coin.values()) {
			System.out.println(c.toString());
		}

	}

}
