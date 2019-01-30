package midterm2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GuiExcercise extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExcercise frame = new GuiExcercise();
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
	public GuiExcercise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		imageNY(lblImage);

		JLabel lblNewYork = new JLabel("New York");
		labelNY(lblNewYork);

		JButton btnToggle = new JButton("Show New York at Night");
		btnToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lblImage.getBackground().equals(new Color(220, 238, 245))) {
					lblImage.setBackground(new Color(72, 88, 104));
					btnToggle.setText("Show New York at Day");
				} else {
					lblImage.setBackground(new Color(220, 238, 245));
					btnToggle.setText("Show New York at Night");
				}
			}
		});
		btnToggle(btnToggle);
	}

	private void btnToggle(JButton btnToggle) {
		btnToggle.setForeground(new Color(240, 248, 255));
		btnToggle.setBackground(new Color(112, 128, 144));
		btnToggle.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(btnToggle, BorderLayout.SOUTH);
	}

	private void imageNY(JLabel lblImage) {
		lblImage.setIcon(new ImageIcon(GuiExcercise.class.getResource("/midterm2/images/NewYork.png")));
		contentPane.add(lblImage, BorderLayout.CENTER);
		lblImage.setBackground(new Color(220, 238, 245));
	}

	private void labelNY(JLabel lblNewYork) {
		lblNewYork.setBorder(new EmptyBorder(7, 0, 7, 0));
		lblNewYork.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewYork.setForeground(new Color(240, 248, 255));
		lblNewYork.setOpaque(true);
		lblNewYork.setBackground(new Color(112, 128, 144));
		lblNewYork.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewYork, BorderLayout.NORTH);
	}

}
