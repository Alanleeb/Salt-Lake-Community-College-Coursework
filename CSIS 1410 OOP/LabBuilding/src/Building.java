
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// TODO: write code to draw the building
		Random rand = new Random();
		//random RGB values
		int red;
		int green;
		int blue;
		
		setBackground(Color.WHITE);
		//draws building
		g.setColor(Color.BLACK);
		g.drawRect(25, 25, 300, 600);
		g.drawRect(140, 550, 60, 75);
		
		int x = 30;
		int y = 30;
		
		//for loop for row
		for(int i = 0; i<5; i++){
			x=30;
			
		// for loop for number of windows
		for(int j = 0; j<5; j++){
			red=rand.nextInt(255);
			green = rand.nextInt(255);
			blue = rand.nextInt(255);
			Color c = new Color(red, green, blue);
			g.setColor(c);
			g.fillRect(x, y, 40, 60);
			x+=62;
		}
			y+=100;
		}
		
	}

}
