import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabGuiLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
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
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblLbl = label1();
		contentPane.add(lblLbl);
		JLabel lblLb = label2();

		JButton btn1 = new JButton("Click Me!");
		btn1.setOpaque(true);
		btn1.setBorderPainted(false);
		btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLUE);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn1.getBackground().equals(Color.BLUE)) {
					btn1.setBackground(Color.GREEN);
				} else {
					btn1.setBackground(Color.BLUE);
				}

			}
		});

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn1.getBackground().equals(Color.GREEN)) {
					lblLb.setBackground(Color.YELLOW);
				}

			}
		});

		contentPane.add(btn1);

		contentPane.add(lblLb);

		JButton btnBtn = new JButton("Button");
		btnBtn.setBorderPainted(false);
		btnBtn.setOpaque(true);
		btnBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btnBtn.setForeground(Color.WHITE);
		btnBtn.setBackground(Color.BLUE);
		contentPane.add(btnBtn);
	}

	private JLabel label2() {
		JLabel lblLb = new JLabel("Hi");
		lblLb.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLb.setOpaque(true);
		lblLb.setBackground(Color.RED);
		lblLb.setHorizontalAlignment(SwingConstants.CENTER);
		return lblLb;
	}

	private JLabel label1() {
		JLabel lblLbl = new JLabel("Lbl1");
		lblLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLbl.setOpaque(true);
		lblLbl.setBackground(Color.RED);
		lblLbl.setHorizontalAlignment(SwingConstants.CENTER);
		return lblLbl;
	}

}
